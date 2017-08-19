package javatutorials.ch6Class.sec08.exam01_method_declaration;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class Calculator {
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double devide(int x , int y){
        double result = (double)x / (double)y;
        return result;
    }

    }

