package inflearn_java.Pattern.strategy_pattern;

import inflearn_java.Pattern.strategy_pattern.action_interface.FlyNo;
import inflearn_java.Pattern.strategy_pattern.action_interface.FlyYes;
import inflearn_java.Pattern.strategy_pattern.action_interface.KnifeLazer;
import inflearn_java.Pattern.strategy_pattern.action_interface.MisailYes;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class MainClass {
    public static void main(String[] args) {

        System.out.println("SuperRobot을 만들어 주세요");

        Robot superRobot = new SuperRobot();
        superRobot.shape();
        superRobot.actionWalk();
        superRobot.actionRun();
        superRobot.setFly(new FlyYes());
        superRobot.actionFly();
        superRobot.setMisail(new MisailYes());
        superRobot.actionMisail();
        superRobot.setKnife(new KnifeLazer());
        superRobot.actionKnife();
        superRobot.setFly(new FlyNo());
        superRobot.actionFly();

    }
}
