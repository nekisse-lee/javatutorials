package org.opentutorials.javatutorials.ch4;

/**
 * Created by Nekisse_lee on 2017. 5. 17..
 */
public class test4 {
    public static void main(String[] args) {
        for(int i = 0; i <5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
                if(j==i){
                    System.out.println();
                }
            }
        }
    }
}
