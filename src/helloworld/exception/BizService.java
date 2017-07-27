package helloworld.exception;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class BizService {
    public void bizMethod(int i) throws BizExcetption{
        System.out.println("비지니스 메소드 시작");

        if(i < 0)
            throw new BizExcetption("매개변수 i는 0 이상이어야 합니다. ");


        System.out.println("비지니스 메소드 종료");


    }


}
