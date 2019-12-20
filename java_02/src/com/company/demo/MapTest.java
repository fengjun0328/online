package com.company.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map counties=new HashMap();
        counties.put("CN","中华人民共和国");
        counties.put("US","美利坚合众国");
        counties.put(1,"eeee");
        counties.put(1,"rrrrrrrrr");
        System.out.println(counties.get(1));
        for (Object obj:counties.keySet()) {
            System.out.println(counties.get(obj));
        }
        counties.remove(1);

        Iterator iterators=counties.keySet().iterator();
        while (iterators.hasNext()){
            String key=(String)iterators.next();
            System.out.println();
        }

        Page<String> page=new Page<String>();
        page.list.add("");
        Page<Integer> page1=new Page<Integer>();
        page1.list.add(1);
    }
}
