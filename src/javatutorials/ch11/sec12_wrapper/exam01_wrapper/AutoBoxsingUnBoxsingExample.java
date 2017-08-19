package javatutorials.ch11.sec12_wrapper.exam01_wrapper;

/**
 * Created by Nekisse_lee on 2017. 7. 11..
 */
public class AutoBoxsingUnBoxsingExample {
    public static void main(String[] args){
        Integer obj = 100;
        System.out.println("vlaue : " + obj.intValue());


        //대입시 자동 UnBoxsing
        int value = obj;
        System.out.println(value);

        //연산시 자동 UnBoxsing
        int result = obj + 100;
        System.out.println("result : " + result);
    }
}
