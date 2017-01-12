package me.kazyle.pomelo.support.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>pomelo</p>
 * <p>
 * <b>BaseEntity</b> is
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/10 16:57
 */
public class BaseEntity<ID extends Serializable> implements Serializable {

    private String createBy;

    private Date createDate;

    private String lastModifiedBy;

    private Date lastModifiedDate;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
