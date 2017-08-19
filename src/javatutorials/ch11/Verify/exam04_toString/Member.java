package javatutorials.ch11.Verify.exam04_toString;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class Member {
    private String id;
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
