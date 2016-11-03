package me.kazyle.pomelo.entity;


import me.kazyle.pomelo.entity.enums.RechargeStatus;

import java.math.BigDecimal;

/**
 * <p>kimber</p>
 * <p>
 * <b>RechargeStatus</b> is RechargeStatus Entity 充值记录表
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/10 16:30
 */
public class Recharge extends BaseEntity<String> {

    private String rechargeNo;

    private String period;

    private String memberNo;

    private String cardNo;

    private BigDecimal amount;

    private boolean success;

    private RechargeStatus status;

    public String getRechargeNo() {
        return rechargeNo;
    }

    public void setRechargeNo(String rechargeNo) {
        this.rechargeNo = rechargeNo;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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

    public RechargeStatus getStatus() {
        return status;
    }

    public void setStatus(RechargeStatus status) {
        this.status = status;
    }
}
