package org.opentutorials.javatutorials.ch11.sec03.exam02;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class Key {
    public int number;

    public Key(int number){
        this.number = number;
    }


    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()");
        if(obj instanceof Key){
            Key compareKey = (Key) obj;
            if(this.number==compareKey.number){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()");
        return number;
    }
}
