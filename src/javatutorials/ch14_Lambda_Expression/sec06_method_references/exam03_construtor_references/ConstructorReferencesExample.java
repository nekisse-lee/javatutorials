package javatutorials.ch14_Lambda_Expression.sec06_method_references.exam03_construtor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("angel");

        BiFunction<String, String , Member> function2 = Member::new;
        Member member2 = function2.apply("신천사", "angel");




    }
}
