package org.opentutorials.javatutorials.constant2;

class Fruit {
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
class Company {
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();

}

public class ConstantDemo {

    public static void main(String[] args) {


        Fruit type = Fruit.APPLE;
        switch (type) {
            case Fruit.APPLE:
                System.out.println(57 + " kcal");
                break;
            case Fruit.PEACH:
                System.out.println(34 + " kcal");
                break;
            case Fruit.BANANA:
                System.out.println(93 + " kcal");
                break;
        }
    }
}
