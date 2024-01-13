package com.neusoft.his.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yhc
 * @since 2024-01-14
 */
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String fullname;

    private String password;

    private String userType;

    private String department;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Users{" +
        "username=" + username +
        ", fullname=" + fullname +
        ", password=" + password +
        ", userType=" + userType +
        ", department=" + department +
        "}";
    }
}
