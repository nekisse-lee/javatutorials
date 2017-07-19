package org.opentutorials.javatutorials.ch16_Stream.sec11_stream_collect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 19..
 */
public class MaleStudent  {
    private List<Student> list;

    public MaleStudent() {
        list = new ArrayList<Student>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }

    public void accumulate(Student student) {
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    public void combine(MaleStudent other) {
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }

    public List<Student> getList() {
        return list;
    }
}
