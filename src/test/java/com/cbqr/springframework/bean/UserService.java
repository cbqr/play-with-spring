package com.cbqr.springframework.bean;

/**
 * UserService 对象，方便后续对 Spring 容器进行测试
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class UserService {

    private String name;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }

}
