package javatutorials.ch6Class.sec08.exam04_overloading;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        double result1 = myCalc.areaRectangle(10);

        double result2 = myCalc.areaRectangle(10, 20);

        System.out.println("정사각형의 넓이 : "+ result1);
        System.out.println("직사각형의 넓이 : "+ result2);

    }


}
