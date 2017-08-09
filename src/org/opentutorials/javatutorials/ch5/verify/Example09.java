package org.opentutorials.javatutorials.ch5.verify;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 8..
 */
public class Example09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0.0;
        boolean run = true;
        int scores[] = null;

        while (run){
            System.out.println("1. 학생수 2.점수입력 3. 점수리스트 4. 분석 5. 종료");
            System.out.print("선택> ");
            int selectNum = scanner.nextInt();
            switch (selectNum){
                case 1:
                    System.out.print("학생 수> ");
                    int stuendtNum = scanner.nextInt();
                    scores = new int[stuendtNum];
                    break;
                case 2:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]> ");
                         scores[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scanner[" + i +  "]: " +scores[i]);
                    }
                    break;
                case 4:
                    int max = 0;
                    for (int i = 0; i < scores.length; i++) {
                        sum += scores[i];
                    }

                    for (int i = 0; i < scores.length; i++) {
                        max = scores[i]>max? scores[i]: max;
                    }

                    avg = (double)sum/scores.length;
                    System.out.println("총 점수 합계 : " + sum);
                    System.out.println("제일 높은 점수: " + max);
                    System.out.println("평균 점수 : " + avg);

                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");

    }
}
