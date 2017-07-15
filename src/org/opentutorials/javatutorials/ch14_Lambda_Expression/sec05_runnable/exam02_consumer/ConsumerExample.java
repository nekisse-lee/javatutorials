package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec05_runnable.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("자바");

        BiConsumer<String, String > biConsumer = (t,u) -> System.out.println(t + u);
        biConsumer.accept("Java", "8");

        DoubleConsumer doubleConsumer = d -> System.out.println("자바"+d);
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer = (t,i)-> System.out.println(t+i);
        objIntConsumer.accept("자바",8);
    }
}
