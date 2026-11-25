package com.java.mall2.util;

import com.java.mall2.resp.UserLoginResp;

import java.io.Serializable;

public class LoginUserContext implements Serializable {
    private static ThreadLocal<UserLoginResp> user=new ThreadLocal<>();
    public static UserLoginResp getUser(){
        return user.get();
    }
    public static void setUser(UserLoginResp user){
        com.java.mall2.util.LoginUserContext.user.set(user);
    }
}
