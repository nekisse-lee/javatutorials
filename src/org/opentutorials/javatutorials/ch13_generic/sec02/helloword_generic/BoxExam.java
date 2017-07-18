package org.opentutorials.javatutorials.ch13_generic.sec02.helloword_generic;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class BoxExam {
    public static void main(String[] args) {
        /*Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("hello");

        String str = (String)box.getObj();

        System.out.println(str);

        box.setObj(1);
        int value = (int)box.getObj();
        System.out.println(value);
*/
        Box<Object> box = new Box<Object>();
        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> box1 = new Box<>();
        box1.setObj("hello");
        String str = box1.getObj();

        Box<Integer> box2 = new Box<>();
        box2.setObj(2);
        int value = box2.getObj();
        System.out.println(value);
    }
}
