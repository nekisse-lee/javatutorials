package org.opentutorials.javatutorials.ch10.verify.exam07;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class LoginExample {
    public static void main(String[] args) {

        try {
            login("whilte","12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue","54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }






    public static void login(String id, String password) throws WrongPasswordException, NotExistIDException{
        if(!id.equals("blue")){
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }



        if(!password.equals("12345"))  {
            throw new WrongPasswordException("패스워드가 틀립니다");

        }
    }
}
