package org.opentutorials.javatutorials.ch6Class.verify.exam19_account;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고 : " +  account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고 : " +  account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고 : " +  account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고 : " +  account.getBalance());
    }
}