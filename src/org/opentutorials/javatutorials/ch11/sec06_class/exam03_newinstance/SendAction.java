package org.opentutorials.javatutorials.ch11.sec06_class.exam03_newinstance;

import org.opentutorials.javatutorials.ch6Class.verify.exam20_bankapplication.Account;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class SendAction implements Action {
    @Override
    public void excute() {
        System.out.println("데이터를 보냅니다.");
    }
}
