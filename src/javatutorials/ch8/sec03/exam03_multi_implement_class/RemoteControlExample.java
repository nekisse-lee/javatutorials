package javatutorials.ch8.sec03.exam03_multi_implement_class;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class RemoteControlExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        rc.trunOn();
        rc.trunOff();
        rc.setVolume(5);



        Searchable searchable = tv;
        searchable.search("http://cafe.mobilewebapp");



    }
}
