package javatutorials.ch8.sec04.exam01_abstract_method_use.exam03_static_method_use;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public interface RemoteControl {
    int MAX_VALUME = 10;
    int MIN_VALUME = 0;


   public abstract void trunOn();
   public abstract void trunOff();
   public abstract void setVolume(int volume);


   public default void setMute(boolean mute){
       if(mute){
           System.out.println("무음 처리합니다.");
       }else{
           System.out.println("무음 해제합니다.");
       }
   }

       public static void changeBattery(){
           System.out.println("건전지를 교환합니다.");

   }
 

}
