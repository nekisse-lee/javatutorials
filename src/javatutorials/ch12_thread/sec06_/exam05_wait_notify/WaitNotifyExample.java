package javatutorials.ch12_thread.sec06_.exam05_wait_notify;

/**
 * Created by Nekisse_lee on 2017. 7. 8..
 */
public class WaitNotifyExample {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();
        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);


        producerThread.start();
        consumerThread.start();
    }
}
