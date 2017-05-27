package org.opentutorials.javatutorials.ch8.exam04;

import javax.xml.crypto.Data;

/**
 * Created by Nekisse_lee on 2017. 5. 26..
 */
public class OracleDao implements DataAccessObject {

    @Override
    public void select() {
        System.out.println("Oracle DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("Oracle DB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB를 수정");

    }

    @Override
    public void delete() {
        System.out.println("Oracle DB에서 삭제");

    }
}
