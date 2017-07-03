package org.opentutorials.javatutorials.ch11.sec15_format.exam01_fomat;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));


        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now)) ;

        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf.format(now)) ;

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now)) ;

        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now)) ;

        sdf = new SimpleDateFormat("이 달의 d번째 날");
        System.out.println(sdf.format(now)) ;

    }
}
