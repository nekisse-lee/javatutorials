package javatutorials.ch13_generic.sec06_generic_whildcard.exam01_generic_whildcard;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
