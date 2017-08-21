package javatutorials.ch19.sec06.exam01_serversocketchannel_socketchnnel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * Created by Nekisse_lee on 2017. 8. 1..
 */
public class ClientExample {
    public static void main(String[] args) {
        SocketChannel socketChannel = null;

        try {
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(true);
            System.out.println("[연결 요청]");
            socketChannel.connect(new InetSocketAddress("localhost",5001));
            System.out.println("[연결 성공]");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (socketChannel.isOpen()){
            try {
                socketChannel.close();
            } catch (IOException e) {}
        }
    }
}