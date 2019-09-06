package cn.xtrui.mbp.temp;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;
import java.util.UUID;

/**
 * @author haito
 */
public class JedisT {
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool();

        Jedis jedis = jedisPool.getResource();
        jedis.sadd("mykey","my","hhh");
        Set<String> strings = jedis.smembers("mykey");
        System.out.println(strings);
        jedis.close();
        String code = UUID.nameUUIDFromBytes("my".getBytes()).toString().replaceAll("-","");
        System.out.println(code);
        

    }
}
