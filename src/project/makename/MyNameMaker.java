package project.makename;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nekisse_lee on 2017. 8. 11..
 */
public class MyNameMaker implements NameMaker2 {

    private Map<String, String> yearMap;
    private Map<String, String> monthMap;
    private Map<String, String> dateMap;

    public MyNameMaker() {

        yearMap     = new HashMap<>();
        monthMap     = new HashMap<>();
        dateMap     = new HashMap<>();

        yearMap.put("0", "물레방앗간에서");
        yearMap.put("1", "밤마다");
        yearMap.put("2", "눈코 뜰새 없이");
        yearMap.put("3", "허구헌 날");
        yearMap.put("4", "소싯적");
        yearMap.put("5", "빌어먹을");
        yearMap.put("6", "처먹기만하고");
        yearMap.put("7", "배때지가 불러");
        yearMap.put("8", "부모잘만나");
        yearMap.put("9", "할일없이");

        monthMap.put("1", "잡일하던");
        monthMap.put("2", "마당쓸던");
        monthMap.put("3", "헛간치우던");
        monthMap.put("4", "반란을일으킨");
        monthMap.put("5", "담넘던");
        monthMap.put("6", "족보를산");
        monthMap.put("7", "나라팔아먹은");
        monthMap.put("8", "똥치우던");
        monthMap.put("9", "기생집만드나들던");
        monthMap.put("10", "밤일만잘하던");
        monthMap.put("11", "나무패던");
        monthMap.put("12", "배곪던");

        dateMap.put("1", "덕순이");
        dateMap.put("2", "노비들의왕");
        dateMap.put("3", "김대감네종");
        dateMap.put("4", "이대감네종");
        dateMap.put("5", "박대감네종");
        dateMap.put("6", "산적두목");
        dateMap.put("7", "왜나라앞잡이");
        dateMap.put("8", "청나라앞잡이");
        dateMap.put("9", "방자");
        dateMap.put("10", "내시들의왕");
        dateMap.put("11", "기둥서방");
        dateMap.put("12", "기생오라비");
        dateMap.put("13", "백정");
        dateMap.put("14", "거지들의왕");
        dateMap.put("15", "막내거지");
        dateMap.put("16", "거지들의NO.2");
        dateMap.put("17", "초보내시");
        dateMap.put("18", "거렁뱅이");
        dateMap.put("19", "동네바보");
        dateMap.put("20", "욕쟁이할머니");
        dateMap.put("21", "귀향살이하던양반");
        dateMap.put("22", "관노");
        dateMap.put("23", "추노꾼");
        dateMap.put("24", "탐관오리");
        dateMap.put("25", "노름꾼");
        dateMap.put("26", "아부떨던이방");
        dateMap.put("27", "명나라왕서방");
        dateMap.put("28", "몰락한역적가문장자");
        dateMap.put("29", "어미기생");
        dateMap.put("30", "끝순이");
        dateMap.put("31", "말년이");
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
