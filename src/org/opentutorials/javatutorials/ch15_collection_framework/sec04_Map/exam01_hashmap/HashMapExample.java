package org.opentutorials.javatutorials.ch15_collection_framework.sec04_Map.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 entry 수: " + map.size());

        System.out.println("홍길동:: " + map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);

            System.out.println("\t" + key + "; " + value);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 entry 수: " + map.size());


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        map.clear();
        System.out.println("총 entry 수: " + map.size());


    }
}
