package helloworld.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("kim");
        list.add("kang");
        list.add("kim");


        System.out.println(list.size());

        for (int i = 0; i <list.size();  i ++){
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
