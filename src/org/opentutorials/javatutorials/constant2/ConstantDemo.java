package org.opentutorials.javatutorials.constant2;

import static org.opentutorials.javatutorials.constant2.Fruit.*;

//class Fruit {
//   public static final Fruit APPLE = new Fruit();
//   public static final Fruit PEACH = new Fruit();
//   public static final Fruit BANANA = new Fruit();
//}   == enum  연관된 상수들의 집합 클래
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    public String getColor(){
        return this.color;
    }
    Fruit(String color){
        System.out.println("Call Constructor" + this);
        this.color = color;
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE
}
public class ConstantDemo {

    public static void main(String[] args) {

        for (Fruit f : Fruit.values()){
            System.out.println(f);
        }

        Fruit type = APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, color " + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal, color " + Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal, color " + Fruit.BANANA.getColor());
                break;
        }
    }
}