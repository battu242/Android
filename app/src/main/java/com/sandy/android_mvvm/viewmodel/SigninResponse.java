package com.sandy.android_mvvm.viewmodel;

public class SigninResponse {

    public int statusCode( String userName,  String userPassword) {

        if ((userName.equals("abc@gmail.com")) && (userPassword.equals("1234567")))
        {
            return 200;}
        else{return 400;}

    }
}
