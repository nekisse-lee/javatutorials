package javatutorials.ch4.sec03.verify.exam06;

/**
 * Created by Nekisse_lee on 2017. 6. 25..
 */
public class Exercise06 {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++ ){
            for (int j = 1; j <= i ; j++){
                System.out.print("*");
                if (j==i){
                    System.out.println();
                }
            }
        }
    }
}
