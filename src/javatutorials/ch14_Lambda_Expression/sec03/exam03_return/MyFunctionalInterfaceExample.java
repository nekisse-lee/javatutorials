package javatutorials.ch14_Lambda_Expression.sec03.exam03_return;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x, y) ->{
          int result = x + y;
          return result;
        };
        System.out.println(fi.method(2,5));

        fi = (x, y) -> {return x + y; };
        System.out.println(fi.method(2,5));

        fi = (x, y) -> x + y;
        System.out.println(fi.method(2,5));

        fi = (x, y) -> sum(x,y);
        System.out.println(fi.method(2,5));

    }

    public static int sum(int x, int y){
        return (x+y);
    }
}
