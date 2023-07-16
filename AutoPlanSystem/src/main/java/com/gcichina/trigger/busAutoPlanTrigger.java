package com.gcichina.trigger;

import com.gcichina.bean.LimitConditionData;
import com.gcichina.bean.RouteStationData;
import com.gcichina.bean.test1;
import com.gcichina.utils.dbUtils;
import java.util.HashMap;

public class busAutoPlanTrigger {
    public static void main(String[] args){
        dbUtils loadCkUtils = new dbUtils();
//        HashMap<Integer, test1> readtest = loadCkUtils.readtest();
//        for(test1 temp:readtest.values()) System.out.println(temp);
//        System.out.println("--------------");
//        HashMap<Integer, RouteStationData> routeStationData= loadCkUtils.readRouteStationData();
//        for (RouteStationData temp: routeStationData.values()) System.out.println(temp);
        HashMap<Integer, LimitConditionData> conditionData = loadCkUtils.readConditionData();
        for (LimitConditionData temp: conditionData.values()) System.out.println(temp);


    }

    // 长线班次数
    public int getFragment (int time_fragment_consumer_max,int capacity,float consumer_percentage_max){
        float v = time_fragment_consumer_max / (capacity * consumer_percentage_max);
        return 0;
    }
}
