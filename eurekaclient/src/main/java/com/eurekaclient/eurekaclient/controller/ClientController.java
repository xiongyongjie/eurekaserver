package com.eurekaclient.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("getmyinfo/{id}")
    public String getUserInfo(@PathVariable String id){
        System.out.print("id is:"+id);
        return id+":8763";
    }

}
