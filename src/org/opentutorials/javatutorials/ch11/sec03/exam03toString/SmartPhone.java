package org.opentutorials.javatutorials.ch11.sec03.exam03toString;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class SmartPhone {
    private String company;
    private String os;


    public SmartPhone(String company, String os){
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + "," + os;
    }
}
