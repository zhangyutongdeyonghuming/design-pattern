package org.example.designpattern.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginServiceFactory {

    private static Map<String, ILogin> loginMap = new ConcurrentHashMap<>();

    static {
        loginMap.put("mobile", new MobileLogin());
        loginMap.put("username", new UsernameLogin());
    }

    public static ILogin getLoginService(String type) {
        return loginMap.get(type);
    }
}
