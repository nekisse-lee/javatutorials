package javatutorials.ch14_Lambda_Expression.sec05_runnable.exam07_andthen_compse;

import java.util.function.Function;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class FuncionAndThenComplseExample {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;

        Function<Member, String> functionAB;

        functionA = (m) ->m.getAdress();
        functionB = (a) ->a.getCity();

        functionAB = functionA.andThen(functionB);


        String city = functionAB.apply(
                new Member("홍길동", "hong", new Address("한국","서울"))
        );
        System.out.println("거주 도시: " + city);


        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("홍길동", "hong", new Address("한국","서울"))
        );
        System.out.println("거주 도시: " + city);



    }
}
