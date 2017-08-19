package javatutorials.ch15_collection_framework.sec02_array_list.exam02_vertor;

import java.util.List;
import java.util.Vector;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class VectorExample {
    public static void main(String[] args) {
        List<Borad> list = new Vector<Borad>();

        list.add(new Borad("제목1","내용1","글쓴이1"));
        list.add(new Borad("제목2","내용2","글쓴이2"));
        list.add(new Borad("제목3","내용3","글쓴이3"));
        list.add(new Borad("제목4","내용4","글쓴이4"));
        list.add(new Borad("제목5","내용5","글쓴이5"));


        list.remove(2);
        list.remove(3);

        for (int i = 0; i<list.size(); i++){
            Borad board = list.get(i);
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }



    }
}
