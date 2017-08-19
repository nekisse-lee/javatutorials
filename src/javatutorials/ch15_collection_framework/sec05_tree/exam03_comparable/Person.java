package javatutorials.ch15_collection_framework.sec05_tree.exam03_comparable;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age<o.age)return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}
