package com.x;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListCompare {
    public static void main(String[] args){
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        for(int i=0;i<50;i++){
            Map<String,Object> mp =  new HashMap<String,Object>();
            mp.put("count",new Integer((int)(Math.random()*500)));
            list.add(mp);
        }
        System.out.println(list);
    }
}
