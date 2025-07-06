package base;

import java.util.ArrayList;

public class ArryListTest {
    public static void main(String[] args) {

        ArrayList<String> arry = new ArrayList<>(20);

        arry.add("af");
        arry.add("ed");
        for (String num: arry){
            System.out.println(num);
        }
    }
}