package org.opentutorials.javatutorials.loop;

/**
 * Created by Nekisse_lee on 2017. 4. 30..
 */
public class LoopDepthDemo {
    public static void main(String[] args) {
        for ( int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.println(i + "" + j);
            }
        }
    }
}
