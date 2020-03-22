package com.example.demo.controller;

import com.example.demo.dao.NameDao;
import com.example.demo.pojo.Name;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * @version 1.0
 * @description:
 * @author: bing
 * @date: 2020/3/21 18:25
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private NameDao nameDao;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/redis")
    public String redis(){
        String redis = redisTemplate.opsForValue().get("redis");
        System.out.println(redis);
        System.out.println(123);
        System.out.println(123);
        redisTemplate.opsForValue().set("redis","asdf");
        return redis;
    }

    @RequestMapping("/demo")
    public String demo(){
        return "请求成功";
    }

    @RequestMapping("/name")
    public Name name(){
        List<Name> all = nameDao.findAll();

        try {
            System.out.println("qqqqqqqqqqqqqqqq");
        } catch (Exception e) {
            log.info("1111111111111111111111");
            e.printStackTrace();
        }
        for (Name name : all) {
            System.out.println(name);
        }
        return all.get(0);
    }

}
