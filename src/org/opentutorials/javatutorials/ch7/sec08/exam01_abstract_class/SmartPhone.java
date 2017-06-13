package org.opentutorials.javatutorials.ch7.sec08.exam01_abstract_class;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class SmartPhone extends Phone{
    public SmartPhone(String owner) {
        super(owner);
    }


    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
