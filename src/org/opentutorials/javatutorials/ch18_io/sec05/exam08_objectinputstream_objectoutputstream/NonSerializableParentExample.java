package org.opentutorials.javatutorials.ch18_io.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 7. 29..
 */
public class NonSerializableParentExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Temp/Object.dat");
        ObjectOutputStream oos  = new ObjectOutputStream(fos);


        Child child= new Child();
        child.field1 = "홍길동";
        child.field2 = "홍삼원";

        oos.writeObject(child);
        oos.flush();
        oos.close();
        fos.close();


        FileInputStream fis = new FileInputStream("Temp/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Child v = (Child) ois.readObject();

        System.out.println(v.field1);
        System.out.println(v.field2);

        ois.close();
        fis.close();


    }

}
