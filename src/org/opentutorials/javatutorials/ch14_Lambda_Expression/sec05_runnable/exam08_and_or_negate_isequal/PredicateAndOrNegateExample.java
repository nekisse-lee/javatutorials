package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec05_runnable.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        //2의 배수를 검사

        IntPredicate predicateaA = a -> a%2 ==0;

        // 3의 배수를 검사

        IntPredicate predicateB = a -> a%3 == 0;

        IntPredicate predicateAB;
        boolean result;

        //and()
        predicateAB = predicateaA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수입니까? " + result);

        //or()
        predicateAB = predicateaA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수입니까? " + result);

        //negate
        predicateAB=predicateaA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 홀수 있니까? " + result);



    }
}
