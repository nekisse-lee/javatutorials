package javatutorials.ch7.sec07exam07intanceof;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class InstancOfExample {
    public static void method1(Parent parent){
        if(parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환성공");
        }else{
            System.out.println("Child로 변환되지 않음");
        }
    }
      public static void method2(Parent parent){
        Child child = (Child) parent;
          System.out.println("method2 - Child로 변환성공");

      }

    public static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);
        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB);   //instanceof 클래스캐스트익셉션 발


    }

}
