package org.opentutorials.javatutorials.ch11.sec06;

/**
 * Created by Nekisse_lee on 2017. 6. 1..
 */
public class NewInstanceExample {
    public static void main(String[] args) {
        try {
//            Class clazz = Class.forName("org.opentutorials.javatutorials.ch11.sec06.SendAction");
            Class clazz = Class.forName("org.opentutorials.javatutorials.ch11.sec06.ReceiveAction");
            Action action = (Action)    clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}


