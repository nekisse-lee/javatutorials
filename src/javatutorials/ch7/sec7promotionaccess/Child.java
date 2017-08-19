package javatutorials.ch7.sec7promotionaccess;

/**
 * Created by Nekisse_lee on 2017. 6. 10..
 */
public class Child extends Parent{
    @Override
    public void method2() {
        System.out.println("Child - method2()");
    }

    public void method3(){
        System.out.println("Child - method3()");
    }
}
