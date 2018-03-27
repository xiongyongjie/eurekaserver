package com.feignclient.demo.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "eurekaclient")
public interface FeignService {

    @RequestMapping(value = "getmyinfo/{id}",method = RequestMethod.GET)
    String getInfo(@PathVariable(value = "id") String id);

}
