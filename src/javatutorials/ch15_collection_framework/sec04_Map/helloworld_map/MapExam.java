package javatutorials.ch15_collection_framework.sec04_Map.helloworld_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("001","kim");
        map.put("002","lee");
        map.put("003","choi");

        map.put("001","kang");


        System.out.println(map.size());
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + " : " +value);
        }


    }
}
