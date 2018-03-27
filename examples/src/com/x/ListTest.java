package com.x;

import java.util.*;

public class ListTest {
    public  static void main(String[] args){
        System.out.print("mmm");
        List<ComparaleMap> list = new ArrayList<ComparaleMap>();
        for(int i=0;i<50;i++){
            ComparaleMap mp =  new ComparaleMap<String,Integer>("count");
            mp.getMap().put("count",new Integer((int)(Math.random()*500)));
            list.add(mp);
        }
        System.out.print(list);
        list.forEach(e->{
            ComparaleMap me = (ComparaleMap)e;
            System.out.println(me.getMap().get("count"));
           // System.out.println(e);
        });

        Collections.sort(list,new MapComp("count"));


        //自身排序
        // Collections.sort(list);
        System.out.println("------------------");
        list.forEach(e->{
            //ComparaleMap me = (ComparaleMap)e;
            System.out.println(e.getMap().get("count"));
            // System.out.println(e);
        });
    }
}
