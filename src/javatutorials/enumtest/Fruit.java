package javatutorials.enumtest;

/**
 * Created by Nekisse_lee on 2017. 7. 15..
 */
public enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");

    private String color;

    public String getColor(){
        return this.color;
    }




    Fruit(String color){
        System.out.println("Call Constructor " + this);
        this.color = color;
    }
}
