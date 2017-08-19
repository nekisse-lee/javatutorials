package javatutorials.ch3.sec04.exam01_arithmetic;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class InputDataCheckNaNExample2 {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        if(Double.isNaN(val)){
            System.out.println("NaN 입력되어 처리할수 없음");
            val = 0.0;
        }
        //currentBalance = currentBalance + val;
        currentBalance += val;



        System.out.println(currentBalance);
    }
}
