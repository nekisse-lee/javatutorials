package org.opentutorials.javatutorials.ch12_thread.sec07_deamon.exam01_deamon;

/**
 * Created by Nekisse_lee on 2017. 7. 10..
 */
public class AutoSaveThread extends  Thread{
    public void save(){
        System.out.println("작업내용을 저장함");
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}
