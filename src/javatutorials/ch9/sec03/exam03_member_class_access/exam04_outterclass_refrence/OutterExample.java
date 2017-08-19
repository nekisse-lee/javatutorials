package javatutorials.ch9.sec03.exam03_member_class_access.exam04_outterclass_refrence;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class OutterExample {
    public static void main(String[] args) {
          Outter outter = new Outter();
          Outter.Nested nested = outter.new Nested();

             nested.prient();



    }
}
