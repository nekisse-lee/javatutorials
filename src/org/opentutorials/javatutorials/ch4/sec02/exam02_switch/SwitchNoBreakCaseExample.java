package org.opentutorials.javatutorials.ch4.sec02.exam02_switch;

/**
 * Created by Nekisse_lee on 2017. 6. 23..
 */
public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int)(Math.random()*4) + 8;
        System.out.println("[현재 시간] : " +time + " 시");

        switch (time){
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");

        }

    }
}
