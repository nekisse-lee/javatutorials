package javatutorials.ch15_collection_framework.sec03_Set.helloworld_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class setExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");

        System.out.println(set1.size());

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
