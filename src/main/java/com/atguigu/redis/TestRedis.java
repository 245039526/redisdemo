package com.atguigu.redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author Allen
 * 2020/9/4 16:04
 */
public class TestRedis {
    public static void main(String[] args) {

    }
    Jedis jedis=null;
    @Before
    public void init(){
        jedis = new Jedis("hadoop102", 6379);
        System.out.println("初始化");
    }
    @After
    public void close(){
        System.out.println("关闭连接");
        jedis.close();
    }
    @Test
    public void testString(){
        jedis.set("k1","v1");
        System.out.println(jedis.get("k1"));
    }
///////////////////////
    @Test
    public void test1(){
        System.out.println("123456");
    }
}

