package javatutorials.ch13_generic.sec02.exam02_generictype;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class BoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();

        box1.set("hello");
        String greet = box1.get();

        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        int value = box2.get();
    }
}
