package javatutorials.yg;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 4. 30..
 */
public class Test1 {
    public static void main(String[] args) {
        for(Method method : Test2.class.getDeclaredMethods()){
            if(!method.isAnnotationPresent(Test.class)){
                continue;
            }
            Test annotation = method.getAnnotation(Test.class);
            System.out.println(annotation.num() + " : " + annotation.name());
        }

        Scanner scanner = new Scanner(System.in);
        Test2 test2 = new Test2();
        while(scanner.hasNext()){
            switch (scanner.next()){
                case "1" :
                    System.out.println(test2.reg());
                    break;
                case "2" :
                    System.out.println(test2.mod());
                    break;
                case "3" :
                    System.out.println(test2.delete());
                    break;
                case "4" :
                    System.out.println(test2.search());
            }
            System.exit(0);
        }
    }
}
