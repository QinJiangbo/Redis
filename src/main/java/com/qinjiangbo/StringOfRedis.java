package com.qinjiangbo;

import java.util.List;
import redis.clients.jedis.Jedis;

/**
 * @date: 07/06/2017 11:33 PM
 * @author: qinjiangbo@github.io
 */
public class StringOfRedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        // set "name"
        jedis.set("name", "qinjiangbo");
        System.out.println(jedis.get("name"));

        // append "name"
        jedis.append("name", " is my love");
        System.out.println(jedis.get("name"));

        // del "name"
        jedis.del("name");
        System.out.println(jedis.get("name"));

        // multi-set "names"
        jedis.mset("name", "qinjiangbo", "age", "15", "sex", "male");
        System.out.println(jedis.get("name"));
        System.out.println(jedis.get("age"));
        System.out.println(jedis.get("sex"));

        System.out.println("================");
        List<String> values = jedis.mget("name", "age", "sex");
        for (String value: values) {
            System.out.println(value);
        }
    }
}
