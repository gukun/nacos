package com.cstor.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ConfigController {

    @Value("${user}")
    private String userName;
    @Value("pwd")
    private String pwd;

    @RequestMapping("/getValue")
    public String get() {
        return "user name :"+userName+"; pwd: "+pwd;
    }
}

