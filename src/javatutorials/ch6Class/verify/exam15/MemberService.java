package javatutorials.ch6Class.verify.exam15;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class MemberService {
    String name ;
    String id ;
    String password ;
    int age;


    MemberService(){
        this.id = id;
        this.password = password;
    }



    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")){
            return true;
        }else{
            return false;
        }

    }

    public void logout(String id) {
        System.out.println("로그아웃 되었습니다.");
    }
}
