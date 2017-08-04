package helloworld.thread.join;

/**
 * Created by Nekisse_lee on 2017. 8. 4..
 */
public class MyThread5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThred5 : " + i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
