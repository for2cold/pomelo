package me.kazyle.pomelo.support.dubbo.rpc.filter;

import com.alibaba.dubbo.rpc.*;
import me.kazyle.pomelo.support.helper.KazyleHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * <p>pomelo</p>
 * <p>
 * <b>AuthorityFilter</b> is 白名单校验
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/11/10 16:58
 */
public class AuthorityFilter implements Filter {

    private final Logger LOGGER = LoggerFactory.getLogger(AuthorityFilter.class);

    @Resource
    private KazyleHelper kazyleHelper;

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        String clientIp = RpcContext.getContext().getRemoteHost();
        LOGGER.debug("消费端访问IP为 {}", clientIp);
        if (kazyleHelper.checkIpWhiteList(clientIp)) {
            return invoker.invoke(invocation);
        }
        String methodName = RpcContext.getContext().getMethodName();
        LOGGER.warn("没有授权的IP：{}，试图访问：{}", clientIp, methodName);
        return new RpcResult();
    }
}
