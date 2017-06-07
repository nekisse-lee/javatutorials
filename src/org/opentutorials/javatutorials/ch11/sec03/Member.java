package org.opentutorials.javatutorials.ch11.sec03;

/**
 * Created by Nekisse_lee on 2017. 6. 7..
 */
public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member  member = (Member) obj;
            if(id.equals(member.id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
