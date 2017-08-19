package javatutorials.ch6Class.sec08.exam03_method_call;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class Calculator {
    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    double avg(int x, int y){
        double sum = plus(x,y);
        double result = sum / 2;
        return result;
    }


    void execute(){
        double result = avg(7, 10);
        println("실행결과 : " + result);
    }

    void println(String message){
        System.out.println(message);
    }



}
