package javatutorials.ch16_Stream.sec02_streamkind;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class FromArrayExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a -> System.out.println(a + ","));


        System.out.println();

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.println(a + ","));
    }
}
