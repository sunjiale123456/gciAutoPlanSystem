package com.gcichina.trigger;

import com.gcichina.bean.test1;
import com.gcichina.utils.dbUtils;
import java.util.HashMap;

public class busAutoPlanTrigger {
    public static void main(String[] args){
        dbUtils loadCkUtils = new dbUtils();
        HashMap<Integer, test1> readtest = loadCkUtils.readtest();
        for(test1 temp:readtest.values()) System.out.println(temp);

    }
}
