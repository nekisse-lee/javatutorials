package javatutorials.ch16_Stream.sec08_stream_match;

import java.util.Arrays;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class MatchExample {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};

        boolean result = Arrays.stream(intArr).allMatch(a -> a % 2 == 0);

        System.out.println("2의 배수인가: " + result);


        result = Arrays.stream(intArr).anyMatch(a-> a%3==0);
        System.out.println("3의 배수가 하나라도 있는가: " + result);

        result = Arrays.stream(intArr).noneMatch(a->a%3==0);
        System.out.println("3의 배수가 없는가: " + result);

    }
}
