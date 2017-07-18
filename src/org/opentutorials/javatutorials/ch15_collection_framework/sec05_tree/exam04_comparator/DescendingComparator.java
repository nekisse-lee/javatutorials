package org.opentutorials.javatutorials.ch15_collection_framework.sec05_tree.exam04_comparator;

import java.util.Comparator;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class DescendingComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
       if (o1.price < o2.price) return 1;
       else if(o1.price == o2.price) return 0;
       else return -1;
    }
}
