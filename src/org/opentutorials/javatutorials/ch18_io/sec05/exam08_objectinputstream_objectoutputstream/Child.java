package org.opentutorials.javatutorials.ch18_io.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 7. 29..
 */
public class Child extends Parent implements Serializable {
    public String field2;

    private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeUTF(field1);
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws  IOException, ClassNotFoundException{
        field1 = in.readUTF();
        in.defaultReadObject();
    }


}
