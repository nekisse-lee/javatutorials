package javatutorials.ch11.sec04_Objects.exam01_objects;

import java.util.Objects;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class HashCodeExample {
    public static void main(String[] args){

    }


    static class Student{
        int sno;
        String name;

        Student(int sno, String name){
            this.sno = sno;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sno, name);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Student){
                Student s = (Student) obj;
                if(s.sno == this.sno){
                    if (s.name == this.name){
                        return true;
                    }
                }
            }
            return false;
        }
    }



}
