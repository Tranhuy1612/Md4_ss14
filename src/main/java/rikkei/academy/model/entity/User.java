package rikkei.academy.model.entity;

import rikkei.academy.utl.Role;

public class User {
    private int userId ;
    private String userName ;
    private String email ;
    private String password ;
    private String phone ;
    private Role role = Role.USER ;

    public User(){

    }

    public User(int userId, String userName, String email, String password, String phone, Role role) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;
    }

    public User(String userName, String email, String password, String phone, Role role) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
