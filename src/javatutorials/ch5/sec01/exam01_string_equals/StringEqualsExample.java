package javatutorials.ch5.sec01.exam01_string_equals;

/**
 * Created by Nekisse_lee on 2017. 6. 26..
 */
public class StringEqualsExample {
    public static void main(String[] args){
        String strVar1 = "신민철";
        String strVar2 = "신민철";

        if(strVar1==strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");
        }else{
            System.out.println("참조하는 객체가 다름");
        }

        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");

        if(strVar3==strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같음");
        }else{
            System.out.println("참조하는 객체가 다름");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4의 문자열이 같음");
        }else{
            System.out.println(" 문자열이 다름 ");
        }

    }
}