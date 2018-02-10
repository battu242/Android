package com.sandy.android_mvvm.model;

public class User {
    private String email;
    private String password;
    public String emailhint;
    public String passwordhint;

    public User() {
    }

    public User(String emailhint, String passwordhint) {
        this.emailhint = emailhint;
        this.passwordhint = passwordhint;
    }
}
