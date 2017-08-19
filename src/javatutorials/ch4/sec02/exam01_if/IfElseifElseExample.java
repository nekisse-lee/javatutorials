package javatutorials.ch4.sec02.exam01_if;

/**
 * Created by Nekisse_lee on 2017. 6. 23..
 */
public class IfElseifElseExample {
    public static void main(String[] args) {
        int score = 75;
        if(score>=90){
            System.out.println("점수가 100~90 입니다");
            System.out.println("등급은 A입니다.");
        }else if(score>=80){
            System.out.println("점수가 80~89보다 입니다");
            System.out.println("등급은 B입니다.");
        }else if(score>=70){
            System.out.println("점수가 70~79보다 입니다");
            System.out.println("등급은 C입니다.");
        }else{
            System.out.println("점수가 70 미만 입니다");
            System.out.println("등급은 D입니다.");
        }
    }
}
