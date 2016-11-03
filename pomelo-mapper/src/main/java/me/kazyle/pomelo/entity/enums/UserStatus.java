package me.kazyle.pomelo.entity.enums;

/**
 * <p>kimber</p>
 * <p>
 * <b>UserStatus</b> is
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/14 14:30
 */
public enum UserStatus {

    NORMAL("正常"),
    DISABLED("禁用");

    private String label;

    UserStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
