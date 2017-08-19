package javatutorials.ch15_collection_framework.sec03_Set.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class HashSetExample1{
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");  //중복 저장 불가능
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체수: " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
        }
        set.remove("JDBC");
        set.remove("iBATIS");
        System.out.println("총 객체수: " + set.size());

        for(String element : set){
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()){
            System.out.println("비어 있음");
        }




    }
}
