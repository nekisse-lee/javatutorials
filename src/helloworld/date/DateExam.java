package helloworld.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class DateExam {
    public static void main(String[] args) {
        Date date = new Date();
        String now = date.toString();


        System.out.println(now);
        System.out.println(date);

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date));


        System.out.println(date.getTime());

        long today = System.currentTimeMillis();
        System.out.println(today);

        System.out.println(today- date.getTime());
    }
}
