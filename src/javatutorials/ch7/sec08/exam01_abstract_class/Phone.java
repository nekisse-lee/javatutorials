package javatutorials.ch7.sec08.exam01_abstract_class;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public abstract class Phone {
    //필드
    public String owner;

    //샛성자

    public Phone(String owner){
        this.owner = owner;
    }

    //메소드
    public void turnOn(){
        System.out.println(" 전원을 켭니다.");
    }

    public  void turnOff(){
        System.out.println(" 전원을 끕니다.");

    }

}
