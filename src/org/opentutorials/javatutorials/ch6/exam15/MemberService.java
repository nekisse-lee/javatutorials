package org.opentutorials.javatutorials.ch6.exam15;

/**
 * Created by Nekisse_lee on 2017. 5. 21..
 */
public class MemberService {
     boolean login(String id, String password){
         if(id.equals("hong") && password.equals("12345")){
             return true;
         }else{
             return false;
         }
     }
       void logout(String id){
           System.out.println("로그아웃 되었습니다");
       }

}
