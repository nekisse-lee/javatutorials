package org.opentutorials.javatutorials.ch15_collection_framework.sec05_tree.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class TreeSetExample2 {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<Integer>();

        scores.add(87);
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));


        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (Integer score : descendingSet){
            System.out.print(score + " ");
        }
        System.out.println();
        NavigableSet<Integer> asendingSet = descendingSet.descendingSet();
        for (Integer score : asendingSet){
            System.out.print(score + " ");
        }
        System.out.println();
    }


}
