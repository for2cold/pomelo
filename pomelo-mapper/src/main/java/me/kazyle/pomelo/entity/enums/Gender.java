package me.kazyle.pomelo.entity.enums;

/**
 * <p>kimber</p>
 * <p>
 * <b>Gender</b> is
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/14 13:45
 */
public enum Gender {

    MALE("先生"),
    FEMALE("女士");

    private String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
