package com.eclient.eclient.controller;

import com.eclient.eclient.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    ClientService clientService;

    @GetMapping("getinfo/{id}")
    public String getNameById(@PathVariable String id){
        System.out.println("getinfo:"+id);
        return  clientService.getName(id);
    }
    @GetMapping("getByHyx/{id}")
    public String getByHyx(@PathVariable String id){
        System.out.println("getByHyx:"+id);
        return  clientService.getNameByHi(id);
    }
}
