package javatutorials.ch8.verify.exam03.exam03;

/**
 * Created by Nekisse_lee on 2017. 6. 15..
 */
public class SoundableExample {
    private static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }


    public static void main(String[] args) {
        printSound(new Dog());
        printSound(new Cat());
    }
}
