package me.kazyle.pomelo.entity.enums;

/**
 * <p>kimber</p>
 * <p>
 * <b>RechargeStatus</b> is
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/14 14:26
 */
public enum RechargeStatus {

    SUCCESS("充值成功"),
    FAILURE("充值失败"),
    SUPPLEMENT("人工补充");

    private String label;

    RechargeStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
