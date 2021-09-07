package com.wangz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringdataDemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void testInit() {
        String ping = redisTemplate.getConnectionFactory().getConnection().ping();
        System.out.println("ping = " + ping);
    }

    @Test
    public void testString(){
        //插入
        redisTemplate.opsForValue().set("user","hahha");
        Object user = redisTemplate.opsForValue().get("user");
        System.out.println("user = " + user);

    }

}
