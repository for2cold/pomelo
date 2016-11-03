package me.kazyle.pomelo.entity;


import me.kazyle.pomelo.entity.enums.UserStatus;

/**
 * <p>kimber</p>
 * <p>
 * <b>User</b> is User Master Entity 用户表
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/10 16:25
 */
public class User extends BaseEntity<String> {

    private String userNo;

    private String username;

    private String password;

    private String realname;

    private UserStatus status;

    private String roleNo;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }
}
