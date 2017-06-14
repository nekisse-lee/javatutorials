package org.opentutorials.javatutorials.ch8.sec03.exam02_noname_implement_class;

/**
 * Created by Nekisse_lee on 2017. 6. 13..
 */
public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl(){
            public int volume;

            @Override
            public void trunOn() {
                System.out.println("TV를 켭니다");
            }

            @Override
            public void trunOff() {
                System.out.println("TV를 끕니다");

            }

            @Override
            public void setVolume(int volume) {
                if(volume>RemoteControl.MAX_VALUME){
                    this.volume = RemoteControl.MAX_VALUME;
                }else if (volume<RemoteControl.MIN_VALUME){
                    this.volume = RemoteControl.MIN_VALUME;
                }else{
                    this.volume = volume;
                }
                System.out.println("현재 TV 볼륨: " + this.volume);
            }

            public void otherMethod(){/*..*/}
        };

    }
}
