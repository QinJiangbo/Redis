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
        jedis.sadd("redisUser", "Jim");
        jedis.sadd("redisUser", "Coco");
        jedis.sadd("redisUser", "Qi");
        jedis.sadd("redisUser", "Nicolas");
        jedis.sadd("redisUser", "Cruise");
        System.out.println(jedis.smembers("redisUser"));

        // remove
        jedis.srem("redisUser", "Qi");
        System.out.println(jedis.smembers("redisUser"));
        System.out.println(jedis.sismember("redisUser", "Qi"));
        System.out.println(jedis.srandmember("redisUser"));
        System.out.println(jedis.scard("redisUser"));
    }
}
