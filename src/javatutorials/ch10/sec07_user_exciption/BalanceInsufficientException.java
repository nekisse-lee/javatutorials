package javatutorials.ch10.sec07_user_exciption;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class BalanceInsufficientException extends Exception {
    BalanceInsufficientException(){}
    BalanceInsufficientException(String message){
        super(message);
    }

}
