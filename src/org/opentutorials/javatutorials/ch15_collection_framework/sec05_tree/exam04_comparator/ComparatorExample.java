package org.opentutorials.javatutorials.ch15_collection_framework.sec05_tree.exam04_comparator;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + ":" + fruit.price);
        }

    }
}
