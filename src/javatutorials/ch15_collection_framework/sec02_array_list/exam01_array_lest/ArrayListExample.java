package javatutorials.ch15_collection_framework.sec02_array_list.exam01_array_lest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class ArrayListExample {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");


        int size = list.size();
        System.out.println("총 객채수: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();



    }
}
