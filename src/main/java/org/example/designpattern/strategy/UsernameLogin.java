package org.example.designpattern.strategy;

public class UsernameLogin implements ILogin{

    @Override
    public void login(String username, String password) {
        System.out.println("用户名密码登录成功");
    }
}
