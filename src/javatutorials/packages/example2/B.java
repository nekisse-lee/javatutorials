package javatutorials.packages.example2;
// import javatutorials.packages.example1.*;
//모든클래스(*)를 로드
import javatutorials.packages.example1.A;
//클래스 하나만을 지

public class B {
    public static void main(String[] args) {
        //클래스 A가 다른 패키지에 있기 때문에 로드 할 수 없다.
         A a = new A();
    }
}