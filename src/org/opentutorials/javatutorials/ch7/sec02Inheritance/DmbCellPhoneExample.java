package org.opentutorials.javatutorials.ch7.sec02Inheritance;

/**
 * Created by Nekisse_lee on 2017. 6. 9..
 */
public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);


        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);
        System.out.println("채널: " + dmbCellPhone.channel);


        dmbCellPhone.powerOn();
        dmbCellPhone.powerOff();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요 홍길동입니다");
        dmbCellPhone.sendVoice("ㅇㅇㅇ");
        dmbCellPhone.hangUp();

        System.out.println("-----------");
        dmbCellPhone.turnOffDmb();
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeCannelDmb(12);
    }
}
