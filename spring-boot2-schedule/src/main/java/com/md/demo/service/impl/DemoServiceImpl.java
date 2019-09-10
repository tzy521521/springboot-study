package com.md.demo.service.impl;

import com.md.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "hello from service layer";
    }
}
