package javatutorials.ch15_collection_framework.verify.exam07_getBoardList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class BoardDao {

    public List<Board> getBoardList() {
     List<Board> list = new ArrayList<Board>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
     return list;
    }
}
