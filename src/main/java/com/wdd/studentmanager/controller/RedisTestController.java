package com.wdd.studentmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

/**
 * @author summer
 * @date 2022-05-05  9:31
 */
@RestController
@RequestMapping("/redis")
public class RedisTestController {

    /**
     * 注入redistemplate，名字最好跟我保持一致，因为框架
     * 会创建一个跟这个名字一样的对象，这样根据名字来找比较好
     */
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 添加数据到redis，这里添加的是String
     * */

    @GetMapping("/addData")
    public String addData() {
        //添加String类型的数据先获取ValueOperations对象
       ValueOperations valueOperations = redisTemplate.opsForValue();
       valueOperations.set("name","lisi");
       String str = (String) valueOperations.get("name");
       return str;
    }
}
