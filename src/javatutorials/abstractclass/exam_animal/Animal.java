package javatutorials.abstractclass.exam_animal;

/**
 * Created by Nekisse_lee on 2017. 7. 4..
 */
public abstract class Animal {
    String animal_name;

    Animal(String animal_name){
        this.animal_name = animal_name;
    }

    public void cry() {
        System.out.println("운다");
    }
}
