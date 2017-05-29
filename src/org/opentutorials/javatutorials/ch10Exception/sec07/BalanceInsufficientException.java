package org.opentutorials.javatutorials.ch10Exception.sec07;

/**
 * Created by Nekisse_lee on 2017. 5. 29..
 */
public class BalanceInsufficientException extends Exception {

    public BalanceInsufficientException(){}
    public BalanceInsufficientException(String message){
        super(message);
    }
}
