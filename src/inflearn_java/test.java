package inflearn_java;

/**
 * Created by Nekisse_lee on 2017. 8. 15..
 */
public class test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            if (i%2==0){
                sum += i;
                System.out.println(sum);
            }
            System.out.println(sum);

        }


        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "x" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }

        int i =0;
        int iSum = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                iSum += i;
            }
            i++;
        }
        System.out.println(iSum);
    }

}
