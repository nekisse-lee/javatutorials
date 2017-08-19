package javatutorials.ch3.sec04.exam01_arithmetic;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class InputDataCheckNaNExample {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        currentBalance = currentBalance + val;
        System.out.println(currentBalance);
    }
}
