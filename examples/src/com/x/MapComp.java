package com.x;

import java.util.Comparator;
import java.util.Date;
import java.util.Map;

public class MapComp implements Comparator{

    private String orderKey;
    public MapComp(String orderKey){
        this.orderKey = orderKey;
    }
    @Override
    public int compare(Object o1, Object o2) {
        ComparaleMap o1map = (ComparaleMap)o1;
        ComparaleMap o2map = (ComparaleMap)o2;

        Map<String,Object>  map = (Map<String,Object>)o1map.getMap();
        Map<String,Object>  map2= (Map<String,Object>)o2map.getMap();
        if(map.get(orderKey) instanceof Integer){
            if((Integer)map.get(orderKey)>(Integer)map2.get(orderKey)){
                return 1;
            }else if(((Integer)map.get(orderKey)<(Integer)map2.get(orderKey))){
                return -1;
            }else {
                return 0;
            }
        }
        if(map.get(orderKey) instanceof Date){
                return 0;
        }
    return 0;
    }
}
