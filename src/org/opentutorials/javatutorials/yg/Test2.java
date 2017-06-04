package org.opentutorials.javatutorials.yg;

/**
 * Created by Nekisse_lee on 2017. 4. 30..
 */
public class Test2 {

    @Test(num = 1, name = "등록")
    public String reg(){
        return "등록";
    }

    @Test(num = 2, name = "수정")
    public String mod(){
        return "수정";
    }

    @Test(num = 3, name = "삭제")
    public String delete(){
        return "삭제";
    }

    @Test(num = 4, name = "조회")
    public String search(){
        return "";
    }

    public String aaa(){
        return "";
    }
}
