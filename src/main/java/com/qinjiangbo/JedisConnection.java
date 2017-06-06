package com.qinjiangbo;

import redis.clients.jedis.Jedis;

/**
 * @date: 06/06/2017 11:37 PM
 * @author: qinjiangbo@github.io
 */
public class JedisConnection {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server successfully.");
        System.out.println("Server is running: " + jedis.ping());
    }

}
