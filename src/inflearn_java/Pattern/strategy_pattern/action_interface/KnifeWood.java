package inflearn_java.Pattern.strategy_pattern.action_interface;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class KnifeWood implements IKnife {
    @Override
    public void knife() {
        System.out.println("목검이 있습니다");
    }
}
