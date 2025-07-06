package base;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;


/**
    可变数组，类似c++ vector
    默认创建10个，扩容1.5倍 newCapacity = oldCapacity + (oldCapacity >> 1)

    扩容时机： 在size <= capacity+1 时候


    和 java vector区别：
    - vector 翻倍扩容
    - vector 都是同步的，保证线程安全
 */

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> arry = new ArrayList<>(20);


        arry.add("af");
        arry.add("ed");

        arry.remove("zf");


        for (String num: arry){
            System.out.println(num);
        }

        System.out.println("-------------");

        arry.remove("aff");
        for (String num: arry){
            System.out.println(num);
        }


        Object[] a = arry.toArray();



    }
}