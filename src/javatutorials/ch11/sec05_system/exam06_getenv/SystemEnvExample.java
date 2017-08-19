package javatutorials.ch11.sec05_system.exam06_getenv;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class SystemEnvExample {
    public static void main(String[] args) {

        String javaHome = System.getenv("JAVA_HOME");

        System.out.println("[JAVA_HOME] " + javaHome);
    }
}
