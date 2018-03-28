package com.configclient.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取服务器配置信息
 */
@RestController
public class ConfigController {
    @Value("${democonfigclient.message}")
    String zone;
    @GetMapping("getconfig")
    public String getConfig(){
        System.out.print("zone:"+zone);
        return zone;
    }
}
