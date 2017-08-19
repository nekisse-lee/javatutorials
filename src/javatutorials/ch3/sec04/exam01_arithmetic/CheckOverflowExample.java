package javatutorials.ch3.sec04.exam01_arithmetic;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class CheckOverflowExample {
    public static void main(String[] agrs){
        try {
            int resuelt = safeAdd(2000000000 , 2000000000);
            System.out.println(resuelt);
        }catch (ArithmeticException e) {
            System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
         }
        }

        public static int safeAdd(int left, int right){
            if(right > 0){
                if(left > (Integer.MAX_VALUE - right)){
                    throw new ArithmeticException("오버플로우 발생");
                }
            }else{
                if(left > (Integer.MIN_VALUE - right)){
                    throw new ArithmeticException("오버플로우 발생");
                }

            }
            return left + right;
        }
    }

