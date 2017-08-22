package inflearn_java.stringtokenizer;

import java.util.StringTokenizer;

/**
 * Created by Nekisse_lee on 2017. 8. 22..
 */
public class MainClass {
    public static void main(String[] args) {

        String str1 = "오늘 날씨는 매우 춥고, 눈이 많이 오고 있습니다.";
        String str2 = "2014/12/24";

        StringTokenizer tokenizer1 = new StringTokenizer(str1);
        StringTokenizer tokenizer2 = new StringTokenizer(str2, "/");

        while (tokenizer1.hasMoreTokens()) {
            System.out.println(tokenizer1.nextToken());
        }

        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }



    }
}
