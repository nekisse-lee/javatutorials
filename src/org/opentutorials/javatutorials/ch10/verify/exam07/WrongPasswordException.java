package org.opentutorials.javatutorials.ch10.verify.exam07;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException(){}
    public WrongPasswordException(String massege){
        super(massege);
    }

}
