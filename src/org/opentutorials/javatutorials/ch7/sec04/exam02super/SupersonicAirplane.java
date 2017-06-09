package org.opentutorials.javatutorials.ch7.sec04.exam02super;

/**
 * Created by Nekisse_lee on 2017. 6. 9..
 */
public class SupersonicAirplane extends Airplane {
    public static final int NOMARL = 1;
    public static final int SUPERSONIC = 2;

      public int flyMode = NOMARL;

    @Override
    public void fly() {
      if(flyMode == SUPERSONIC){
          System.out.println("초음속 비행 합니다");
      }else{
       super.fly();
      }
    }
}
