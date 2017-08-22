package inflearn_java.collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Nekisse_lee on 2017. 8. 22..
 */
public class HashmapEx {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();



/*

        hashMap.put(0, "str0");
        hashMap.put(1, "str1");
        hashMap.put(2, "str2");
        hashMap.put(3, "str3");
        System.out.println(hashMap);
*/


        for (int i = 0; i < 4; i++) {
            hashMap.put(i, String.valueOf("str"+i));
        }
        System.out.println(hashMap);


        hashMap.remove(2);
        System.out.println(hashMap);

        hashMap.clear();
        System.out.println(hashMap);


        for (int i = 0; i < 4; i++) {
            hashMap.put(i, String.valueOf("str"+i));
        }
        System.out.println(hashMap.toString());

        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(hashMap.get(iterator.next()));
        }

    }
}
