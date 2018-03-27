package com.eclient.eclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 使用DefaultProperties指定全局的配置信息
 */
@Service
@DefaultProperties(
        groupKey = "DefaultGroupKey",
        threadPoolKey = "mythreadkey",
        commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
        },
        threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "30"),
            @HystrixProperty(name = "maxQueueSize", value = "101"),
            @HystrixProperty(name = "keepAliveTimeMinutes", value = "2"),
            @HystrixProperty(name = "queueSizeRejectionThreshold", value = "15"),
            @HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "12"),
            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "1440")
        })
public class ClientService {
    @Autowired
    RestTemplate restTemplate;
    public  String getName(String id){
        String result = restTemplate.getForObject("http://eurekaclient/getmyinfo/"+id,String.class);
        System.out.print("result:"+result);
        return result;
    }
    @HystrixCommand(fallbackMethod = "defaultStores")
    public String getNameByHi(String id){
        String result = restTemplate.getForObject("http://eurekaclient/getmyinfo/"+id,String.class);
        System.out.print("result:"+result);
        return result;
    }

    /**
     * 快速失败回调方法
     *  此方法和源方法参数要保持一致
     * @param parameters
     * @return
     */
    public String defaultStores(String parameters) {
        System.out.print("params:"+parameters);
        return "error by  hystrix"/* something useful */;
    }
}
