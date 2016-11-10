package me.kazyle.pomelo.support.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * <p>pomelo</p>
 * <p>
 * <b>KazyleProperties</b> is Base Properties.
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/11/10 16:01
 */
@ConfigurationProperties(prefix = "kj")
public class KazyleProperties {

    /**
     * IP白名单
     */
    private List<String> ipWhiteList;

    public List<String> getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }
}
