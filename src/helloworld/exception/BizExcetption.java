package helloworld.exception;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class BizExcetption extends RuntimeException{
    public BizExcetption(String msg){
        super(msg);
    }

    public BizExcetption(Exception ex){
        super(ex);
    }
}
