package javatutorials.ch11.Verify.exam08_Split;

import java.util.StringTokenizer;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class SplitExample {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";
        String[] tokens = str.split(",");
        for (String token : tokens){
            System.out.println(token);
        }
        System.out.println();

        StringTokenizer st = new StringTokenizer(str ,",");
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}
