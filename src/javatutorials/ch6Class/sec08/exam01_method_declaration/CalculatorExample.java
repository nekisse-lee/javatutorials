package javatutorials.ch6Class.sec08.exam01_method_declaration;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(10,30);
        System.out.println("result1 : " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalc.devide(x,y);
        System.out.println("result2 : " + result2);
    }
}
