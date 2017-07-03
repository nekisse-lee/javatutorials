package org.opentutorials.javatutorials.ch11.sec14_date_calendar.exam02_calendar;

import java.util.Calendar;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_WEEK);


        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;

        switch (week){
            case Calendar.MONDAY:
                strWeek = "월";
                break;
            case Calendar.TUESDAY:
                strWeek = "화";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "수";
                break;
            case Calendar.THURSDAY:
                strWeek = "목";
                break;
            case Calendar.FRIDAY:
                strWeek = "금";
                break;
            case Calendar.SATURDAY:
                strWeek = "토";
                break;
            case Calendar.SUNDAY:
                strWeek = "일";
                break;
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm =  null;

        if(amPm==Calendar.AM_PM){
            strAmPm = "오전";
        }else{
            strAmPm = "오후";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(strWeek + "요일");
        System.out.println(strAmPm);
        System.out.println(hour+ "시 " + minute + "분 " + second + "초");




    }
}
