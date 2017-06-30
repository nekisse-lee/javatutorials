package org.opentutorials.javatutorials.ch10.verify.exam07;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class NotExistIDException extends Exception {
    public NotExistIDException(){}
    public NotExistIDException(String message){
        super(message);
    }

}
