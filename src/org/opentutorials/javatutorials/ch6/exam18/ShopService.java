package org.opentutorials.javatutorials.ch6.exam18;

/**
 * Created by Nekisse_lee on 2017. 5. 21..
 */
public class ShopService {
    private static ShopService singleton = new ShopService();

    private ShopService(){}

    public static ShopService getInstance(){
        return  singleton;
    }
}
