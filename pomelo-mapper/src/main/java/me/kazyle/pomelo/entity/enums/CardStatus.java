package me.kazyle.pomelo.entity.enums;

/**
 * <p>kimber</p>
 * <p>
 * <b>CardStatus</b> is
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/14 13:47
 */
public enum CardStatus {

    NOACTIVE("未激活"),
    ACTIVED("使用中"),
    DESTROYED("已注销")
    ;

    private String label;

    CardStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
