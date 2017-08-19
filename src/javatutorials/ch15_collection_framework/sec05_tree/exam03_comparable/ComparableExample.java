package javatutorials.ch15_collection_framework.sec05_tree.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 25));
        treeSet.add(new Person("박지원", 31));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.name + ":" + person.age);
        }

    }
}
