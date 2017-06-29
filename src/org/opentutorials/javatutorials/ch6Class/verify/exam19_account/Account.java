package org.opentutorials.javatutorials.ch6Class.verify.exam19_account;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class Account {
    public  static final int MIN_BALANCE = 0;
    public  static final int MAX_BALANCE = 1000000;
    private  int balance;




    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE){
            return;
        }else{
            this.balance = balance;
        }

    }
}
