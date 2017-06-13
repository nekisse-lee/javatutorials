package org.opentutorials.javatutorials.ch7.sec07exam06casting;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class ChildExample {
    public static void main(String[] args) {
           Parent parent = new Child();

           parent.field1 = "data1";

           parent.method1();
           parent.method2();

//           parent.field2 = "date2";
//           parent.method3();

           Child child = (Child)parent;
            child.field2 = "date2";
            child.method3();


    }
}
