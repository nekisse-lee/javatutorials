package javatutorials.ch6Class.sec10.exam02_static_block;

/**
 * Created by Nekisse_lee on 2017. 6. 28..
 */
public class Television {
    static String company = "Samsung";
    static String model ="LCD";
    static String info;
    static int from1To10Sum;

    static{
        info = company + "-" + model;

        int sum = 0;
        for (int i = 1; i <=10 ; i++ ){
            sum += i;
        }
        from1To10Sum = sum;


    }



}
