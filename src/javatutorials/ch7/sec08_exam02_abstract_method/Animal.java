package javatutorials.ch7.sec08_exam02_abstract_method;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public abstract class Animal {

    public String kind;

    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }

     public abstract void sound();      //강제 재정의    재정의하지않을시 컴파일오류
}
