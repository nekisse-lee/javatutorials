package javatutorials.ch14_Lambda_Expression.sec05_runnable.exam07_andthen_compse;

import java.util.function.Consumer;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (m) -> {
            System.out.println("consumerA: " + m.getName());
        };


        Consumer<Member> consumerB = (m) -> {
            System.out.println("consumerB: " + m.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "hong", null));
    }
}
