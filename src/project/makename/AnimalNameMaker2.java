package project.makename;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nekisse_lee on 2017. 8. 11..
 */
public class AnimalNameMaker2 implements NameMaker2
{
    private Map<String, String> yearMap;    // Mapt선언
    private Map<String, String> monthMap;
    private Map<String, String> dateMap;


    public AnimalNameMaker2()             // 생성자
    {
        yearMap  = new HashMap<>();        // 맵 정의(할당)
        monthMap = new HashMap<>();
        dateMap  = new HashMap<>();

        yearMap.put("0","초원을 지배할");
        yearMap.put("1","가벼운");
        yearMap.put("2","거대한");
        yearMap.put("3","빛나는");
        yearMap.put("4","위엄있는");
        yearMap.put("5","냄새나는");
        yearMap.put("6","남성미 넘치는");
        yearMap.put("7","바람을 가르는");
        yearMap.put("8","거친");
        yearMap.put("9","못생긴");

        monthMap.put("1","발을 가진");
        monthMap.put("2","눈을 가진");
        monthMap.put("3","털을 가진");
        monthMap.put("4","꼬리을 가진");
        monthMap.put("5","이를 가진");
        monthMap.put("6","발톱을 가진");
        monthMap.put("7","혀을 가진");
        monthMap.put("8","잇몸을 가진");
        monthMap.put("9","몸을 가진");
        monthMap.put("10","귀을 가진");
        monthMap.put("11","속눈썹을 가진");
        monthMap.put("12","주둥이을 가진");

        dateMap.put("1","강아지");
        dateMap.put("2","고양이");
        dateMap.put("3","흰 수염 고래");
        dateMap.put("4","아나콘다");
        dateMap.put("5","오리 너구리");
        dateMap.put("6","토끼");
        dateMap.put("7","참치");
        dateMap.put("8","호랑이");
        dateMap.put("9","돼지");
        dateMap.put("10","몽구스");
        dateMap.put("11","나무늘보");
        dateMap.put("12","개구리");
        dateMap.put("13","개미핥기");
        dateMap.put("14","코끼리");
        dateMap.put("15","황소");
        dateMap.put("16","불곰");
        dateMap.put("17","기린");
        dateMap.put("18","흑룡");
        dateMap.put("19","일본 쥐");
        dateMap.put("20","얼룩말");
        dateMap.put("21","사자");
        dateMap.put("22","대왕오징어");
        dateMap.put("23","츄파카브라");
        dateMap.put("24","원숭이");
        dateMap.put("25","독수리");
        dateMap.put("26","하마");
        dateMap.put("27","우파루파");
        dateMap.put("28","티라노사우르스");
        dateMap.put("29","빠가사리");
        dateMap.put("30","알파카");
        dateMap.put("31","호모사피엔스");


    }

    @Override
    public String getFirst(String data) {
        // TODO Auto-generated method stub
        return yearMap.get(data);
    }

    @Override
    public String getMiddle(String data) {
        // TODO Auto-generated method stub
        return monthMap.get(data);
    }

    @Override
    public String getLast(String data) {
        // TODO Auto-generated method stub
        return dateMap.get(data);
    }



}