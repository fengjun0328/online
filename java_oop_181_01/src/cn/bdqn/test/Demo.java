package cn.bdqn.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,Object> maps=new HashMap<Integer,Object>();
        maps.put(1,"张三");
        maps.put(2,"张三1");
        maps.put(3,"张三2");
        maps.put(4,"张三3");
        maps.put(5,"张三4");

        for (Integer key:maps.keySet()) {
            System.out.println(maps.get(key));
        }

        Iterator<Integer> keys=maps.keySet().iterator();
        while (keys.hasNext()){
            System.out.println(maps.get(keys.next()));
        }
    }
}
