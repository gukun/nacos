package com.cstor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosProviderApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user");
        String pwd = applicationContext.getEnvironment().getProperty("pwd");
        System.err.println("user name :"+userName+"; pwd: "+pwd);

    }

}