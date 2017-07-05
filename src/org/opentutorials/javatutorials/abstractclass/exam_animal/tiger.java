package org.opentutorials.javatutorials.abstractclass.exam_animal;

/**
 * Created by Nekisse_lee on 2017. 7. 4..
 */
public class tiger extends Animal {
    @Override
    public void cry() {
        System.out.println("어흥");
    }

    tiger(String animal_name) {
        super(animal_name);
    }
}
