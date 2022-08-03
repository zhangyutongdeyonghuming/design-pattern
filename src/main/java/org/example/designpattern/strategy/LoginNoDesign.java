package org.example.designpattern.strategy;

public class LoginNoDesign {

    /**
     * 登录方法, 不使用策略模式时, 对于流程的扩展如新增一种登录方式只能添加if
     *
     * @param username 用户名
     * @param password 密码
     * @param type     登录方式
     */
    public void login(String username, String password, String type) {
        if ("mobile".equals(type)) {
            // 手机号登录
            System.out.println("手机号登录成功");
        } else {
            // 用户名密码登录
            System.out.println("用户名密码登录成功");
        }
    }
}
