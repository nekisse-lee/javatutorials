package javatutorials.ch11.sec07_string.exam02_method;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class StringEqualsExample {
    public static void main(String[] args) {
    String strVar1 = new String("신용권");
    String strVar2 = "신용권";
    String strVar3 = "신용권";

    if (strVar1==strVar2){
        System.out.println("같은 String객체를 참조");
    }else{
        System.out.println("다른 String객체를 참조");

    }

    if (strVar1.equals(strVar2)){
        System.out.println("같은 문자열을 가짐");
    }else{
        System.out.println("다른 문자열을 가짐");
    }


    }

}
