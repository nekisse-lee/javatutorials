package javatutorials.ch8.sec07.exam01_why_default_method;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public interface MyInterface {
    public void method1();


    public default void method2(){
        System.out.println("MyInterface-method2() 실행");
    }
}
