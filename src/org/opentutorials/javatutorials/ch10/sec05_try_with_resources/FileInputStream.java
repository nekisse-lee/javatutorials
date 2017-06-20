package org.opentutorials.javatutorials.ch10.sec05_try_with_resources;

/**
 * Created by Nekisse_lee on 2017. 6. 19..
 */
public class FileInputStream implements AutoCloseable {
    private String file;
    public FileInputStream(String file){
        this.file = file;
    }

    public void read(){
        System.out.println(file + "을 읽습니다.");
    }
    @Override
    public void close() throws Exception {
        System.out.println(file + "을 닫습니다.");
    }
}
