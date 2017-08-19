package javatutorials.ch8.sec04.exam01_abstract_method_use.exam02_default_method_use;

/**
 * Created by Nekisse_lee on 2017. 6. 13..
 */
public class Audio implements RemoteControl {
    private int volume;
    private boolean mute;

    @Override
    public void trunOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void trunOff() {
        System.out.println("Audio를 끕니다");

    }

    @Override
    public void setVolume(int volume) {
        if(volume> MAX_VALUME){
            this.volume = MAX_VALUME;
        }else if (volume< MIN_VALUME){
            this.volume = MIN_VALUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute){
            System.out.println("Audio 무음 처리합니다");
        }else{
            System.out.println("Audio 무음 해합니다");

        }
    }
}
