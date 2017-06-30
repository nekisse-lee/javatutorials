package org.opentutorials.javatutorials.ch11.sec05_system.exam02_gc;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class GcExample {
    public static void main(String[] args) {
        Employee emp;

        emp = new Employee(1);
        emp = null;
        emp = new Employee(2);
        emp = new Employee(3);

        System.out.print("emp가 최종적으로 참조하는 사원 번호 : ");
        System.out.println(emp.eno);
        System.gc();


    }
}
