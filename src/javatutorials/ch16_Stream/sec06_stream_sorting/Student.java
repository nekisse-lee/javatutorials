package javatutorials.ch16_Stream.sec06_stream_sorting;

/**
 * Created by Nekisse_lee on 2017. 7. 18..
 */
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }
}
