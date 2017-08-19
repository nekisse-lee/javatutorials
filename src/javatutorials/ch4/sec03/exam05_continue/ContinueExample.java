package javatutorials.ch4.sec03.exam05_continue;

/**
 * Created by Nekisse_lee on 2017. 6. 25..
 */
public class ContinueExample {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++){

            if (i%2 != 0){
                continue;
            }

            System.out.println(i);
        }


    }
}
