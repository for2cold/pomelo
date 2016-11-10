package me.kazyle.pomelo.support.helper;

import me.kazyle.pomelo.support.config.KazyleProperties;
import me.kazyle.pomelo.support.constants.KazyleConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>pomelo</p>
 * <p>
 * <b>KazyleHelper</b> is Base Helper
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/11/10 16:16
 */
@Service("kazyleHelper")
public class KazyleHelper {

    private final Logger LOGGER = LoggerFactory.getLogger(KazyleConstants.LogLevel.SYSTEM);

    @Resource
    private KazyleProperties kazyleProperties;

    /**
     * IP 白名单
     */
    private static Map<String, Boolean> ipWhilteMap = null;

    /**
     * IP
     * @param ip
     * @return
     */
    public boolean checkIpWhiteList(String ip) {
        if (ipWhilteMap == null) {
//            ipWhilteMap = Maps.
        }
        if (ipWhilteMap.isEmpty()) {
            LOGGER.warn("Ip White List is Empty. Please check Kazyle Properties!");
        }
        return ipWhilteMap.get(ip);
    }


}
