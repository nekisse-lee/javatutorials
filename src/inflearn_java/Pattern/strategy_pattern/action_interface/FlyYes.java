package inflearn_java.Pattern.strategy_pattern.action_interface;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class FlyYes implements IFly {
    @Override
    public void fly() {
        System.out.println("날 수 있습니다.");
    }
}
