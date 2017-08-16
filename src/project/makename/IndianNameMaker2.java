package project.makename;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nekisse_lee on 2017. 8. 11..
 */
public class IndianNameMaker2 implements NameMaker2
{
    Map<String, String> yearMap;
    Map<String, String> monthMap;
    Map<String, String> dayMap;

    public IndianNameMaker2()
    {
        yearMap = new HashMap<>();  //뒤에 <> 타입안넣어도 기본으로 찾아줌

        yearMap.put("0","말많은");
        yearMap.put("1","푸른");
        yearMap.put("2","어두운");
        yearMap.put("3","조용한");
        yearMap.put("4","웅크린");
        yearMap.put("5","백색");
        yearMap.put("6","지혜로운");
        yearMap.put("7","용감한");
        yearMap.put("8","날카로운");
        yearMap.put("9","욕심많은");

        monthMap = new HashMap<>();

        monthMap.put("1","늑대");
        monthMap.put("2","태양");
        monthMap.put("3","양");
        monthMap.put("4","매");
        monthMap.put("5","황소");
        monthMap.put("6","불꽃");
        monthMap.put("7","나무");
        monthMap.put("8","달빛");
        monthMap.put("9","말");
        monthMap.put("10","돼지");
        monthMap.put("11","하늘");
        monthMap.put("12","바람");

        dayMap = new HashMap<>();

        dayMap.put("1", "와(과) 함께춤을");
        dayMap.put("2", "의 기상");
        dayMap.put("3", "은(는) 그림자속에 ");
        dayMap.put("4", "");
        dayMap.put("5", "");
        dayMap.put("6", "");
        dayMap.put("7", "의 환생");
        dayMap.put("8", "의 죽음");
        dayMap.put("9", "아래에서");
        dayMap.put("10", "를(을) 보라");
        dayMap.put("11", "이(가) 노래하다");
        dayMap.put("12", "그림자");
        dayMap.put("13", "의 일격");
        dayMap.put("14", "에게 쫒기는 남자");
        dayMap.put("15", "의행진");
        dayMap.put("16", "의 왕");
        dayMap.put("17", "유령");
        dayMap.put("18", "의 죽인자");
        dayMap.put("19", "는(은) 맨날 잠잔다");
        dayMap.put("20", "처럼");
        dayMap.put("21", "의 고향");
        dayMap.put("22", "의 전사");
        dayMap.put("23", "은(는) 나의친구");
        dayMap.put("24", "의 노래");
        dayMap.put("25", "의 정령");
        dayMap.put("26", "의 파수꾼");
        dayMap.put("27", "의 악마");
        dayMap.put("28", "과 같은 사나이");
        dayMap.put("29", "을 쓰러트린자");
        dayMap.put("30", "을 혼");
        dayMap.put("31", "은(는)말이 없다");
    }

    @Override
    public String getFirst(String data) {
        System.out.println(data);
        return yearMap.get(data);
    }

    @Override
    public String getMiddle(String data) {
        return monthMap.get(data);
    }

    @Override
    public String getLast(String data) {
        return dayMap.get(data);
    }

}