package inflearn_java.Pattern.strategy_pattern.action_interface;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class KnifeLazer implements IKnife {
    @Override
    public void knife() {
        System.out.println("레이저 검이 있습니다");
    }
}
