package com.example.demo.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String mail;
    private String password;


    private Date regDate;
    private Date lastLog;
    private boolean status;
    private boolean active;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getRegDate() { return regDate; }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getLastLog() {
        return lastLog;
    }

    public User() {
    }

    public User(String name, String mail, String password) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.status = true;
        this.active = true;
        this.regDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        this.lastLog = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setLastLog(Date lastLog) {
        this.lastLog = lastLog;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
