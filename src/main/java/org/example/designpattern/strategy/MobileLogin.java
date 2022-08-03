package org.example.designpattern.strategy;

public class MobileLogin implements ILogin{

    @Override
    public void login(String username, String password) {
        System.out.println("手机号登录成功");
    }
}
