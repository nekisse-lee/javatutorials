package org.opentutorials.javatutorials.ch11.sec05_system.exam02_gc;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class Employee {
    public int eno;


    public Employee(int eno){
        this.eno = eno;
        System.out.println("Employee(" + eno + ")이 메모리에 생성됨 ");

    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Employee(" + eno + ")이 메모리에서 제거됨 ");
    }
}
