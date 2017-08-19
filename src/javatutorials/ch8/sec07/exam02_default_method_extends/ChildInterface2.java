package javatutorials.ch8.sec07.exam02_default_method_extends;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public interface ChildInterface2 extends ParentInterface {
    @Override
    public default void method2() {
        System.out.println("ChildInterface2-method2() 실행");
    }

    public void method3();


}
