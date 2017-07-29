package org.opentutorials.javatutorials.ch18_io.sec06.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Nekisse_lee on 2017. 7. 29..
 */
public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내컴퓨터 ip 주소: " + local.getHostAddress());

            InetAddress[] isArr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : isArr){
                System.out.println("www.naver.com Ip 주소: " + remote.getHostAddress());

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
