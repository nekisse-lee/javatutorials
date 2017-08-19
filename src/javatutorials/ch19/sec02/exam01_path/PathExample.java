package javatutorials.ch19.sec02.exam01_path;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * Created by Nekisse_lee on 2017. 7. 31..
 */
public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("src/org/opentutorials/javatutorials/ch19/sec02/exam01_path/PathExample.java");

        System.out.println("[파일명]: " + path.getFileName());
        System.out.println("[부모 디렉토리명]  " + path.getParent().getFileName());
        System.out.println("[중첩 경로수] " + path.getNameCount());

        System.out.println();

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i));
        }

        System.out.println();

        Iterator<Path> iterator = path.iterator();
        while(iterator.hasNext()){
            Path temp = iterator.next();
            System.out.println(temp.getFileName());
        }



    }
}
