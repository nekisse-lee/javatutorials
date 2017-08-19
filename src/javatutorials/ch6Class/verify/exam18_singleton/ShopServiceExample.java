package javatutorials.ch6Class.verify.exam18_singleton;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1==obj2){
            System.out.println("같은 객체입니다.");
        }else{
            System.out.println("다른 객체 입니다");
        }
    }
}
