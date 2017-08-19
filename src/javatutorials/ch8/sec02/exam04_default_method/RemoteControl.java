package javatutorials.ch8.sec02.exam04_default_method;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public interface RemoteControl {
    int MAX_VALUME = 10;
    int MIN_VALUME = 0;


     // 인터페이스의 추상메소드 선언
    //    public abtract 자동추가되어서 쓸필요는없다
   public abstract void trunOn();
   public abstract void trunOff();
   public abstract void setVolume(int volume);


      // 자바7  이후  8부터 생겨났다
   //  default는 반드시 붙여줘야한다.
    // public  생략가능
    //나머지는 메소드처럼
   public default void setMute(boolean mute){
       if(mute){
           System.out.println("무음 처리합니다.");
       }else{
           System.out.println("무음 해제합니다.");
       }
   }
 

}
