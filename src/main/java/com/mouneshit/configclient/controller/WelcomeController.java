package com.mouneshit.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeController {

    @Value("${our.application.name}")
    private String appName;


    @GetMapping("/health")
    public String health(){
        return "ok";
    }

    @GetMapping("/app-name")
    public String getAppName(){
        return appName;
    }




}
