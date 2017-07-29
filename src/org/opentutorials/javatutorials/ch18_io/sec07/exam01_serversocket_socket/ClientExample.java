package org.opentutorials.javatutorials.ch18_io.sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Nekisse_lee on 2017. 7. 29..
 */
public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("[연결 성공]");
        }catch(Exception e){
            e.printStackTrace();
        }

        if (!socket.isClosed()){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
