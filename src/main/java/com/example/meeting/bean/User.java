package com.example.meeting.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Integer userId;

    private String userName;

    private String department;

    private String authority;

    private String mail;

    private String telephone;

    private Boolean userIsOpen;

    private String password;

    public User(){
        super();
    }

    public User(String userName, String department, String authority, String mail, String telephone, Boolean userIsOpen, String password) {
        this.userName = userName;
        this.department = department;
        this.authority = authority;
        this.mail = mail;
        this.telephone = telephone;
        this.userIsOpen = userIsOpen;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getUserIsOpen() {
        return userIsOpen;
    }

    public void setUserIsOpen(Boolean userIsOpen) {
        this.userIsOpen = userIsOpen;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

