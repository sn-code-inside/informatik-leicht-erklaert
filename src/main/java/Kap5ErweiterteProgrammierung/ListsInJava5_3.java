package Kap5ErweiterteProgrammierung;

import java.util.ArrayList;
import java.util.LinkedList;


public class ListsInJava5_3 {
    public static void main(String[] args) {
        //create list:
        ArrayList<String> list = new ArrayList<>();
        /* alternatively:
        LinkedList<String> list = new LinkedList<>();*/

        //add elements to list
        list.add("apples");
        list.add("ketchup");

        //add element at first index
        list.add(0,"tea");

        //remove apples from list
        list.remove("apples");

        //check for sugar on list
        System.out.println(list.contains("sugar"));

    }
}
