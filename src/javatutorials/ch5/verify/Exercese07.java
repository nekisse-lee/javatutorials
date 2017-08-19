package javatutorials.ch5.verify;

/**
 * Created by Nekisse_lee on 2017. 8. 8..
 */
public class Exercese07 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};
        for(int arr : array){
            if (arr>max){
               max= arr;
            }

        }

        System.out.println("max: "  + max);
    }
}
