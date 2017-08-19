package javatutorials.ch14_Lambda_Expression.sec05_runnable.exam09_minby_maxby;

import java.util.function.BinaryOperator;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class OperatorMinByMaxByExample {
    public static void main(String[] args) {
        BinaryOperator<Fruit> binaryOperator;
        Fruit fruit;

        binaryOperator = BinaryOperator.minBy((f1,f2) -> Integer.compare(f1.price, f2.price));
        fruit = binaryOperator.apply(new Fruit("딸기",6000), new Fruit("수박", 10000));
        System.out.println(fruit.name);

        binaryOperator = BinaryOperator.maxBy((f1,f2) -> Integer.compare(f1.price, f2.price));
        fruit = binaryOperator.apply(new Fruit("딸기",6000), new Fruit("수박", 10000));
        System.out.println(fruit.name);

    }
}
