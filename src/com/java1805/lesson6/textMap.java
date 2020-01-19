package com.java1805.lesson6;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class textMap {
    public static void main(String[] args) {
        /*
        双列集合
        Map
        1.Hashtable >> Properties
        2.HashMap  >> LikedHashMap
        3.TreeMap
         */
        /*
        Map 接口
        HashMap 集合是Map接口的一个实现类，他用于存储键值映射关系
         */
        Map map = new HashMap();
        map.put("001", "张三");
        map.put("002", "李四");
        map.put("001", "王五");
        map.put("003", "刘六");
        map.put("004", "李四");

        System.out.println("map中是否存在key:008 -->"+map.containsKey("008"));
        System.out.println("mao中是否存在value:张三-->"+map.containsValue("张三"));

        Set keyset = map.keySet();

        for (Object key :
                keyset) {
            System.out.println(key.toString() + ":" + map.get(key));
        }

        System.out.println("对map集合中所有的value 进行遍历输出");

        Collection list=map.values();
        for (Object value:
             list) {
            System.out.println(value);

        }

        Set entrySet=map.entrySet();
        for (Object obj :
                entrySet) {
            Entry entry=(Entry)obj;
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
