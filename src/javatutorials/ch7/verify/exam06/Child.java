package javatutorials.ch7.verify.exam06;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class Child extends Parent {
    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name) {
        super();
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
