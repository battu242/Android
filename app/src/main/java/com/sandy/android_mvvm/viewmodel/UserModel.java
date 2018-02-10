package com.sandy.android_mvvm.viewmodel;
import android.databinding.BaseObservable;


public class UserModel extends BaseObservable  {


    public boolean checkStatus(String userName, String userPassword) {
        SigninResponse signin=new SigninResponse();
        int value = signin.statusCode(userName, userPassword);

        if (value==200)
        {

            return true;
        }
        return false;
    }


}

