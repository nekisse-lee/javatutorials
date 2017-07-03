package org.opentutorials.javatutorials.ch11.Verify.exam13_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class DatePrintExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println(sdf.format(now));

    }
}
