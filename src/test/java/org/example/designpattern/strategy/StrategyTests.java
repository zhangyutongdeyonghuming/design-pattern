package org.example.designpattern.strategy;

import org.junit.Test;

public class StrategyTests {

    @Test
    public void test() {
        LoginNoDesign loginNoDesign = new LoginNoDesign();
        loginNoDesign.login("root", "root", "username");

        // 策略模式
        ILogin login = new MobileLogin();
        login.login("13903291525", "");

        // 结合工厂
        ILogin login1 = LoginServiceFactory.getLoginService("mobile");
        login1.login("13903291525", "");
    }
}
