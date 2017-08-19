package javatutorials.ch9.sec03.exam03_member_class_access.exam04_outterclass_refrence;

/**
 * Created by Nekisse_lee on 2017. 6. 16..
 */
public class Outter {
    String field = "Outter-field";
    void method(){
        System.out.println("Outter-method");
    }

    class Nested{
        String field = "Nested-field";
        void method(){
            System.out.println("Nested-method");
        }

        void prient(){
            System.out.println(this.field);   // Nested 클래스
            this.method();                      // Nested 클래스
            System.out.println(Outter.this.field);  // 바깥클래스
            Outter.this.method();                    //바깥클래스
        }
    }


}
