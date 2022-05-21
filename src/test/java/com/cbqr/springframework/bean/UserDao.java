package com.cbqr.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * UserDao
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "孙生");
        hashMap.put("10002", "大根");
        hashMap.put("10003", "海产");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
