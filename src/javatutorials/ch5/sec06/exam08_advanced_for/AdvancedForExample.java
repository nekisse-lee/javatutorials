package javatutorials.ch5.sec06.exam08_advanced_for;

/**
 * Created by Nekisse_lee on 2017. 6. 26..
 */
public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 85, 93, 87};
        int sum = 0;

        for (int score: scores) {
            sum += score;
            System.out.println(sum);
        }

        System.out.println("총합 : " + sum);

        double avg = (double)sum/scores.length;
        System.out.println("평균 : " + avg);
    }
}
