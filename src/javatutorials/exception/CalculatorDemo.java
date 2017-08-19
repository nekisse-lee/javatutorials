package javatutorials.exception;
class DivideException extends Exception{
    public int left;
    public int right;
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
    DivideException(String message, int left, int right){
        super(message);
        this.left = left;
        this.right = right;
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() throws  DivideException{
            if (right == 0) {
                throw new DivideException("0으로 나눌수 없습니다.", this.left, this.right);
            }
            System.out.print(this.left / this.right);
        }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        }catch (DivideException e ){
            System.out.println(e.getMessage());
            System.out.println(e.left);
            System.out.println(e.right);
        }
    }
}