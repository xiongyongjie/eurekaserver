package com.x;

import java.util.Date;
import java.util.HashMap;
/*
分支测试
v1.0修改后提交相应的信息
V2.0 提交修改bug
V2.0提交bug2
V2.0修改提交3
主版本: Version master 提交修改
master 修改提交v2
 */
public class ComparaleMap<K,V>  implements Comparable{
    HashMap<K,V> map = new HashMap<>();
    private String orderType;
    public ComparaleMap(String orderType){
        this.orderType = orderType;
    }

    public HashMap<K, V> getMap() {
        return map;
    }

    public void setMap(HashMap<K, V> map) {

        this.map = map;
    }

    @Override
    public int compareTo(Object map) {
        ComparaleMap<K, V> sdata = (ComparaleMap<K, V>)map;
        //按照数字排序
        if(sdata.getMap().get(orderType) instanceof Integer){
            if((Integer)sdata.getMap().get(orderType)>(Integer)this.map.get(orderType)){
                return 1;
            }else if((Integer)sdata.getMap().get(orderType)<(Integer)this.map.get(orderType)){
                return -1;
            }else {
                return 0;
            }

        }else if(sdata.getMap().get(orderType) instanceof Date){
            Date tdate = (Date)sdata.getMap().get(orderType);
            Date odate = (Date)this.map.get(orderType);
            if(tdate.compareTo(odate)<0){
                return 1;
            }else if(tdate.compareTo(odate)>0){
                return -1;
            }else {
                return 0;
            }
        }else{
            return 0;
        }


    }
}
