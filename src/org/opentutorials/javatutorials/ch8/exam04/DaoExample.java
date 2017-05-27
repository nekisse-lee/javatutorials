package org.opentutorials.javatutorials.ch8.exam04;

/**
 * Created by Nekisse_lee on 2017. 5. 26..
 */
public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}

