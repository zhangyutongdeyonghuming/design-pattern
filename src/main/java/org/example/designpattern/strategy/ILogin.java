package org.example.designpattern.strategy;

public interface ILogin {

    /**
     * 登录方法
     *
     * @param username 用户名
     * @param password 密码
     */
    void login(String username, String password);
}
