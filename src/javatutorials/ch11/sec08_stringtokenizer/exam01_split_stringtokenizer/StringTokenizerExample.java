package javatutorials.ch11.sec08_stringtokenizer.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

/**
 * Created by Nekisse_lee on 2017. 7. 1..
 */
public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "홍길동/이수홍/박연수";

        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens();
        System.out.println(countTokens);

        for (int i = 0; i < countTokens; i++){
            String token = st.nextToken();
            System.out.println(token);
        }


        st = new StringTokenizer(text, "/");

        while (st.hasMoreTokens());
        String token = st.nextToken();
        System.out.println(token);



    }
}
