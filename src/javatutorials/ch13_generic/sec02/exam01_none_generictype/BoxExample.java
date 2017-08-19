package javatutorials.ch13_generic.sec02.exam01_none_generictype;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class BoxExample {
    public static void main(String[] args){
        Box box = new Box();
        box.set("홍길동");
        String object = (String) box.get();

        box.set(new Apple());
        Apple apple = (Apple) box.get();

        System.out.println(object);
        System.out.println(apple);
    }
}
