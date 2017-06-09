package com.qinjiangbo;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * @date: 08/06/2017 11:45 PM
 * @author: qinjiangbo@github.io
 */
public class MapOfRedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        Map<String, String> map = new HashMap<>();
        map.put("name", "qinjiangbo");
        map.put("age", "23");
        map.put("DingTalk", "qinjiangbo");
        jedis.hmset("user", map);

        // hash map get
        System.out.println(jedis.hmget("user", "name", "age"));
        System.out.println(jedis.hlen("user"));
        System.out.println(jedis.hkeys("user"));
        System.out.println(jedis.hvals("user"));

        // hash map delete
        jedis.hdel("user", "name", "age");

        // hash map judge
        System.out.println(jedis.hmget("user", "name", "age"));
        System.out.println(jedis.hexists("user", "name"));
        System.out.println(jedis.hlen("user"));
        System.out.println(jedis.hkeys("user"));
        System.out.println(jedis.hvals("user"));

    }
}
