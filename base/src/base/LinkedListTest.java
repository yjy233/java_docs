package base;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<String> lLisk = new LinkedList<>();

        lLisk.add("r0");
        lLisk.add("r1");


        lLisk.add(1,"r3");


        // 迭代器
        Iterator<String> it = lLisk.listIterator(3);


        lLisk.remove(it);

        for (String s:lLisk) System.out.println(s);


        //<String> lLisk =  LinkedList

    }



}
