package me.kazyle.pomelo.entity;

/**
 * <p>kimber</p>
 * <p>
 * <b>Role</b> is Role Entity 角色表
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/10 16:34
 */
public class Role extends BaseEntity<String> {

    private String roleNo;

    private String roleName;

    private String comments;

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
