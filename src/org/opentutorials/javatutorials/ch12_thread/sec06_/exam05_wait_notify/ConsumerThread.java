package org.opentutorials.javatutorials.ch12_thread.sec06_.exam05_wait_notify;

/**
 * Created by Nekisse_lee on 2017. 7. 8..
 */
public class ConsumerThread extends  Thread{
    private DataBox dataBox ;

    public ConsumerThread(DataBox dataBox){
        this.setName("ConsumerThread");
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String data = dataBox.getData();

        }
            
        }
    }

