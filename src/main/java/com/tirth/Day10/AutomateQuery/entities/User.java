package com.tirth.Day10.AutomateQuery.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="User")
public class User {

    @Id  // equivalent to <id name="" column="">
//    @GeneratedValue(strategy="auto/native/")
    @Column(name="uid")
    String User;
    @Column(name="upass")
    String pass;

    public User(String user, String pass) {
        this.User = user;
        this.pass = pass;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        this.User = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User() {
    }
}
