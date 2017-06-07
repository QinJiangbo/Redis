package com.qinjiangbo;

import redis.clients.jedis.Jedis;

/**
 * @date: 07/06/2017 11:33 PM
 * @author: qinjiangbo@github.io
 */
public class StringOfRedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        // set "name" value
        jedis.set("name", "qinjiangbo");
        System.out.println(jedis.get("name"));
    }
}
