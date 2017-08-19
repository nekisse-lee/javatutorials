package javatutorials.ch11.sec07_string.exam02_method;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class StringCharAtExample {
    public static void main(String[] args) {
        String ssn = "010624-2230123";

        char sex = ssn.charAt(7);


        switch (sex){
            case'1':
            case'3':
                System.out.println("남자 입니다.");
                break;
            case'2':
            case'4':
                System.out.println("여자 입니다");
                break;
        }
    }

}
