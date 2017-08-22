package inflearn_java.Pattern.strategy_pattern.action_interface;

/**
 * Created by Nekisse_lee on 2017. 8. 21..
 */
public class MisailNo implements IMisail {
    @Override
    public void misail() {
        System.out.println("미사일 을 쏠 수 없습니다");
    }
}
