package javatutorials.ch5.sec06.exam07_array_copy;

/**
 * Created by Nekisse_lee on 2017. 6. 26..
 */
public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ",");
        }
    }
}
