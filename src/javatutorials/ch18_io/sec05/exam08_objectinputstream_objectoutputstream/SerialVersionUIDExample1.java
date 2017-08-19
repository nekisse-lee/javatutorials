package javatutorials.ch18_io.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Nekisse_lee on 2017. 7. 29..
 */
public class SerialVersionUIDExample1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Temp/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);


        ClassC classC = new ClassC();
        classC.field1 = 1;

        oos.writeObject(classC);
        oos.flush();
        oos.close();
        fos.close();



    }
}
