package javatutorials.ch15_collection_framework.verify.exam10_treeset;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if (score<o.score) return -1;
        else if(score == o.score) return 0;
        else return 1;
    }
}
