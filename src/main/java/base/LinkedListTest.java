package base;

import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<String> lLisk = new LinkedList<>();

        lLisk.add("r0");
        lLisk.add("r1");


        lLisk.add(1,"r3");

        for (String s:lLisk) System.out.println(s);
        System.out.println("----------");

        // 迭代器删除
        Iterator<String> it = lLisk.listIterator();
        System.out.println(it.next());


        it.remove();
        System.out.println("----------");

        for (String s:lLisk) System.out.println(s);


        //<String> lLisk =  LinkedList

    }



}
