package org.opentutorials.javatutorials.ch18_io.sec05.exam08_objectinputstream_objectoutputstream;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Nekisse_lee on 2017. 7. 29..
 */
public class SerialVersionUIDExample2 {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("Temp/Object.dat");
        ObjectInputStream ois  = new ObjectInputStream(fis);

        ClassC classC = (ClassC) ois.readObject();

        System.out.println(classC.field1);

        ois.close();
        fis.close();


    }
}
