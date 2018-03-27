package com.feignclient.demo.controller;

import com.feignclient.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {

    @Autowired
    UserService userService;
    @GetMapping("getinfo")
    public String getMinfo(String id){
        return userService.getUserName(id);
    }
}
