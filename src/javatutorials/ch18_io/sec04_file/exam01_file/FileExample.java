package javatutorials.ch18_io.sec04_file.exam01_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("Temp/Dir");
        File file1 = new File("Temp/file1.txt");
        File file2 = new File("Temp/file2.txt");

        if (dir.exists()== false){dir.mkdirs();}
        if (file1.exists()==false){file1.createNewFile();}
        if (file2.exists()==false){file2.createNewFile();}

        File temp = new File("Temp");
        File[] contents = temp.listFiles();

        System.out.println("날짜              시간         형태       크기    이름");
        System.out.println("-------------------------------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd \t a HH:mm");
        for (File file : contents){
            System.out.print(sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()) {
                System.out.print("\t\t<DIR>\t\t\t\t" + file.getName());
            } else {
                System.out.print("\t\t\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }

}
