package org.opentutorials.javatutorials.ch9.exam06;

/**
 * Created by Nekisse_lee on 2017. 5. 28..
 */
public class Chatting {
    void startChat(String chatId) {
		/*String nickName = null;
		nickName = chatId;*/
        String nickName = chatId;
        Chat chat = new Chat() {
            @Override
            public void start() {
                while(true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "] " + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }

    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }
}

