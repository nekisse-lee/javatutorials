package javatutorials.ch16_Stream.sec01_stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class IteratorVsStreamExample {
    public static void main(String[] args){
        List<String> list = Arrays.asList("홍길동", "신용권","감자바");



        //자바 7 이전 Iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }


        //자바 8 이후 Stream
        Stream<String> stringStream = list.stream();
        stringStream.forEach(name -> System.out.println(name));


    }
}
