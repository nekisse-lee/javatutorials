package org.opentutorials.javatutorials.ch15_collection_framework.sec06_stack_queue.exam01_stack;

import java.util.Stack;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));


        while (!coinBox.isEmpty()){
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전: " + coin.getValue())    ;
        }



    }
}
