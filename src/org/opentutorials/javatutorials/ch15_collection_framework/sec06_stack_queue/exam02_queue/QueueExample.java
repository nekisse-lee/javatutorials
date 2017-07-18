package org.opentutorials.javatutorials.ch15_collection_framework.sec06_stack_queue.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();
        messageQueue.offer(new Message("sendMail","홍길동"));
        messageQueue.offer(new Message("sendSMS","신용권"));
        messageQueue.offer(new Message("sendKakaotalk","홍두께"));

        while (!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + " 님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + " 님에게 메일을 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + " 님에게 메일을 보냅니다.");
                    break;

            }
        }
    }
}
