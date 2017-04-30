package org.opentutorials.javatutorials.loop;

/**
 * Created by Nekisse_lee on 2017. 4. 30..
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i  < 10 ; i++){
            if(i==5)
                continue;
            System.out.println("coding everybody" + i);
        }
    }
}
