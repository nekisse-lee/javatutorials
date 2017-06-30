package org.opentutorials.javatutorials.ch10.sec07_user_exciption;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(30000);
            System.out.println("예금  :" + account.getBalance());
        } catch (BalanceInsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            System.out.println(e.toString());
            System.out.println();
            e.printStackTrace();
        }


    }
}
