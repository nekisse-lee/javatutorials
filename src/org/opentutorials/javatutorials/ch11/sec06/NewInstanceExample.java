package org.opentutorials.javatutorials.ch11.sec06;

/**
 * Created by Nekisse_lee on 2017. 6. 1..
 */
public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("ch11.sec06_newinstance.SendAction");
            //Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
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


