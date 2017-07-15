package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec05_runnable.exam08_and_or_negate_isequal;

import java.util.function.Predicate;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class PredicateIsEqualExample {
    public static void main(String[] args) {
        Predicate<String> predicate;
        predicate = Predicate.isEqual(null);
        System.out.println("null, null: " + predicate.test(null));

        predicate = Predicate.isEqual("Java8");
        System.out.println("null, Java8: " + predicate.test(null));

        predicate = Predicate.isEqual(null);
        System.out.println("null, Java8: " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("null, Java8: " + predicate.test("Java8"));

    }
}
