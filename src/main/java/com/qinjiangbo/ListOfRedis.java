package com.qinjiangbo;

import redis.clients.jedis.Jedis;

/**
 * @date: 14/06/2017 10:44 PM
 * @author: qinjiangbo@github.io
 */
public class ListOfRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        jedis.del("java");
        System.out.println(jedis.lrange("java", 0, -1));
    }
}
