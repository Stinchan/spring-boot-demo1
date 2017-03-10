package com.rat.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Stinchan on 2017/3/9.
 */
@RestController
@EnableAutoConfiguration
public class MyRat {
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "this is my rat.";
    }

    @RequestMapping(value = "index/{name}", method = RequestMethod.GET)
    public String indexWithName(@PathVariable String name) {
        return "spring-boot with name:" + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyRat.class, args);
    }

}
