package javatutorials.ch12_thread.sec08_thread_group.exam01_threadgroup;

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
