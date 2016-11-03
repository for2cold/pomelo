package me.kazyle.pomelo.entity;

import java.math.BigDecimal;

/**
 * <p>kimber</p>
 * <p>
 * <b>AccountRecord</b> is Account Record Entity 账户消费记录表
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/10 16:32
 */
public class AccountRecord extends BaseEntity<String> {

    private String recordNo;

    private String memberNo;

    private String period;

    private BigDecimal amount;

    private boolean success;

    private String userNo;

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}
