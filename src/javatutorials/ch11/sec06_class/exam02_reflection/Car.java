package javatutorials.ch11.sec06_class.exam02_reflection;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class Car {
    private String model;
    private String onwer;

    public Car(){}

    public Car(String model){
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOnwer() {
        return onwer;
    }

    private void setOnwer(String onwer) {
        this.onwer = onwer;
    }
}
