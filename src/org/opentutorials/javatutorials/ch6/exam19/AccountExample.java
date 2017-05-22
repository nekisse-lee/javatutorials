package org.opentutorials.javatutorials.ch6.exam19;

/**
 * Created by Nekisse_lee on 2017. 5. 21..
 */
public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());


        account.setBalance(-10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());


        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());
    }
}
