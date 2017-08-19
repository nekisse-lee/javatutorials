package javatutorials.ch11.sec05_system.exam01_exit;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class ExitExample {
    public static void main(String[] args) {

        System.setSecurityManager(new SecurityManager(){
            @Override
            public void checkExit(int status) {
                if(status!=5){
                    throw new SecurityException();
                }
            }
        });




        for (int i = 0; i <10 ; i ++){
            System.out.println(i);
                    try {
                        System.exit(i);
                    }catch (SecurityException e){
                        
                    }
        }


    }



}
