package org.opentutorials.javatutorials.ch11.sec06_class.exam03_newinstance;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("org.opentutorials.javatutorials.ch11.sec06_class.exam03_newinstance.ReceiveAction");
            try {
                Action action = (Action)clazz.newInstance();
                action.excute();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
