package javatutorials.ch15_collection_framework.sec04_Map.exam01_hashmap;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class Student {
    public   int sno;
    public  String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student student = (Student) obj;
            return  sno==student.sno && name==student.name;
        }else{
            return false;
        }
    }


    @Override
    public int hashCode() {
            return sno + name.hashCode();
            // return Objects.hash(sno, name);
    }
}
