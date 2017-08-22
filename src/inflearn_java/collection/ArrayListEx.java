package inflearn_java.collection;

import java.util.ArrayList;

/**
 * Created by Nekisse_lee on 2017. 8. 22..
 */
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("str0");
        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");

        System.out.println(arrayList.toString());

        arrayList.set(2, "str2222");
        System.out.println(arrayList.toString());

        arrayList.remove(2);
        System.out.println(arrayList.toString());

        System.out.println(arrayList.size());

        arrayList.clear();
        System.out.println(arrayList.toString());

        arrayList = null;
        System.out.println(arrayList);

    }
}
