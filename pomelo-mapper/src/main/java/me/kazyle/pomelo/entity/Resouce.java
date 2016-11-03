package me.kazyle.pomelo.entity;

/**
 * <p>kimber</p>
 * <p>
 * <b>Resouce</b> is Resource Entity 资源表
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/10 16:35
 */
public class Resouce extends BaseEntity<String> {

    private String resourceNo;

    private String key;

    private String name;

    private String url;

    public String getResourceNo() {
        return resourceNo;
    }

    public void setResourceNo(String resourceNo) {
        this.resourceNo = resourceNo;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
