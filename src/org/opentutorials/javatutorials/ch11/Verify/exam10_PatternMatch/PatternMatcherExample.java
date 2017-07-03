package org.opentutorials.javatutorials.ch11.Verify.exam10_PatternMatch;

import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";

        boolean isMatch = Pattern.matches(regExp , id);
        if (isMatch){
            System.out.println("ID로 사용할 수 있습니다.");
        }else{
            System.out.println("ID로 사용할 수 없습니다.");

        }
    }
}
