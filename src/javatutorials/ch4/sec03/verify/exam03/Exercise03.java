package javatutorials.ch4.sec03.verify.exam03;

/**
 * Created by Nekisse_lee on 2017. 6. 25..
 */
public class Exercise03 {
    public static void main(String[] args) {
        int sum= 0;
        for (int i = 1; i <= 100; i++) {
            if (i%3==0){
                sum+=i;

            }
        }
        System.out.println("3의배수의 합 : " + sum);
    }
}
