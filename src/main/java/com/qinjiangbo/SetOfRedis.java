package com.qinjiangbo;

import redis.clients.jedis.Jedis;

/**
 * @date: 18/06/2017 11:54 PM
 * @author: qinjiangbo@github.io
 */
public class SetOfRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        // add objects
        jedis.sadd("user", "Jim");
        jedis.sadd("user", "Coco");
        jedis.sadd("user", "Qi");
        System.out.println(jedis.smembers("user"));

        // remove
    }
}
