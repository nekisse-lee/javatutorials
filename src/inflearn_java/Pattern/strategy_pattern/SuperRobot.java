package inflearn_java.Pattern.strategy_pattern;

import inflearn_java.Pattern.strategy_pattern.action_interface.*;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class SuperRobot extends Robot {

    public SuperRobot() {
        fly = new FlyYes();
        misail = new MisailYes();
        knife = new KnifeLazer();
    }

    @Override
    public void shape() {
        System.out.println("SuperRobot 입니다... 외형은  팔, 다리, 몸통 머리가 있습니다");
    }


}
