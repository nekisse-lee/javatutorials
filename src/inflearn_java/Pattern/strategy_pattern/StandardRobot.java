package inflearn_java.Pattern.strategy_pattern;

import inflearn_java.Pattern.strategy_pattern.action_interface.IFly;
import inflearn_java.Pattern.strategy_pattern.action_interface.IKnife;
import inflearn_java.Pattern.strategy_pattern.action_interface.IMisail;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class StandardRobot extends Robot{



    public StandardRobot() {
    }

    @Override
    public void shape() {
        System.out.println("StandardRobot 입니다... 외형은  팔, 다리, 몸통 머리가 있습니다");

    }


}
