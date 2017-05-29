package test;

import test.television.Television;
import test.television.samsung.SamsungTelevision;

/**
 * Created by Nekisse_lee on 2017. 5. 27..
 */
public class TestClass {
    public static void main(String[] args) {
        Television s410 = new Television() {
            @Override
            public void volumnUp() {

            }

            @Override
            public void volumnDown() {

            }

            @Override
            public void turnOn() {
            
            }

            @Override
            public void turnOff() {

            }
        };

        SamsungTelevision s310 = new SamsungTelevision() {
            @Override
            public void actionSamsung() {

            }

            @Override
            public void volumnUp() {

            }

            @Override
            public void volumnDown() {

            }
        };
    }
}
