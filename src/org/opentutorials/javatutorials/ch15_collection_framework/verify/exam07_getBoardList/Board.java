package org.opentutorials.javatutorials.ch15_collection_framework.verify.exam07_getBoardList;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class Board {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    String title;
    String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
