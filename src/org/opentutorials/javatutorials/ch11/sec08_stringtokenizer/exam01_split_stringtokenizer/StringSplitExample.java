package org.opentutorials.javatutorials.ch11.sec08_stringtokenizer.exam01_split_stringtokenizer;

/**
 * Created by Nekisse_lee on 2017. 7. 1..
 */
public class StringSplitExample {
    public static void main(String[] args) {
        String text = "홍길동&이수홍,박연수,김자바-최명호";
        String[] names = text.split("&|,|-");
        for (String name : names){
            System.out.println(name);
        }
    }
}
