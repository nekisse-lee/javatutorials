package inflearn_java.extends_ex;

/**
 * Created by Nekisse_lee on 2017. 8. 18..
 */
public class MainClass {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.cStr);
        System.out.println(childClass.getMamiName());
        System.out.println(childClass.getPapaName());

    }
}
