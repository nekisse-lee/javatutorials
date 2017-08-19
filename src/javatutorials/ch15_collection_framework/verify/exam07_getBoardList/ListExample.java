package javatutorials.ch15_collection_framework.verify.exam07_getBoardList;

import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
