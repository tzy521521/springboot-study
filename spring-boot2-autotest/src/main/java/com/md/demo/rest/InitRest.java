package com.md.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitRest {
    protected static Logger logger = LoggerFactory.getLogger(InitRest.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("hello");
        return "Hello，greetings from sprint-boot2-autotest";
    }
}
