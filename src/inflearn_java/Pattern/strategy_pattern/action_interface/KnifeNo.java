package inflearn_java.Pattern.strategy_pattern.action_interface;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class KnifeNo implements IKnife {
    @Override
    public void knife() {
        System.out.println("검이 없습니다");
    }
}
