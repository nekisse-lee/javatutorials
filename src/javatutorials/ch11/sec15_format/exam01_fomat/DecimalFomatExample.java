package javatutorials.ch11.sec15_format.exam01_fomat;

import java.text.DecimalFormat;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class DecimalFomatExample {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0000000000.00000");
        System.out.println(df.format(num));

        df = new DecimalFormat("#");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.#");
        System.out.println(df.format(num));

        df = new DecimalFormat("##########.#####");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("+#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("-#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0.0E0");
        System.out.println(df.format(num));

        df = new DecimalFormat("+#,### ; -#,###");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.# %");
        System.out.println(df.format(num));

        df = new DecimalFormat("\u00A4 #,###");
        System.out.println(df.format(num));
    }
}