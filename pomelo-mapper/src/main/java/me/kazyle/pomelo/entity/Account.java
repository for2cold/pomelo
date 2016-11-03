package me.kazyle.pomelo.entity;

import java.math.BigDecimal;

/**
 * <p>kimber</p>
 * <p>
 * <b>Account</b> is Account Master Entity 资金账户表
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/10 16:28
 */
public class Account extends BaseEntity<String> {

    private String memberNo;

    private BigDecimal balance;

    private BigDecimal totalAmount;

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
