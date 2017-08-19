package javatutorials.ch4.sec02.exam01_if;

/**
 * Created by Nekisse_lee on 2017. 6. 23..
 */
public class IfNestedExample {
    public static void main(String[] args){
        int score= (int)(Math.random()*20)+ 81;
        String grade;


        System.out.println("점수 : " + score);

        if (score > 90 ){
            if (score>95){
                grade = "ClassA+";
            }else{
                grade = "ClassA";

            }

        }else{
            if (score>85){
                grade = "B+";

            }else{
                grade = "B";
            }
        }
        System.out.println("학점 : " + grade);
    }
}
