package com.feignclient.demo.service;

import com.feignclient.demo.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    FeignService feignService;

    public String getUserName(String id){
       return  feignService.getInfo(id);
    }
}
