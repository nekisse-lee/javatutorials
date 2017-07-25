package test.television;

/**
 * Created by Nekisse_lee on 2017. 7. 24..
 */
public class Rank {
    public static void main(String[] args) {
        int[] array = {75,100,5,2,39,89,79};
        int[] rank= new int[7];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                if (array[i] < array[j]){
                    rank[i]++;
                }
            }
        }
        for (int i = 0; i < rank.length ; i ++){
            System.out.println(rank[i]+1 + "등");
        }

    }
}
