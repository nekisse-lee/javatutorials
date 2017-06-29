package org.opentutorials.javatutorials.ch6Class.verify.exam18_singleton;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class ShopService {
    private static ShopService singleton =new ShopService();


    private ShopService(){}


    public static ShopService getInstance(){
        return singleton;
    }
}
