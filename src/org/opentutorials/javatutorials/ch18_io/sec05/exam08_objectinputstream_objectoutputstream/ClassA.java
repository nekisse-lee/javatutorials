package org.opentutorials.javatutorials.ch18_io.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class ClassA implements Serializable {
    int field1;
    ClassB field2 = new ClassB();

    static int field3;
    transient int field4;
}
