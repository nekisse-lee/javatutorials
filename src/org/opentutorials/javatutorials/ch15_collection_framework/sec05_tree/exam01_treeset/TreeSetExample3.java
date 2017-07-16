package org.opentutorials.javatutorials.ch15_collection_framework.sec05_tree.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by Nekisse_lee on 2017. 7. 16..
 */
public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[c~f사이의 단어 검색]");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true , "f", true);
        for (String word : rangeSet){
            System.out.println(word);
        }
    }
}
