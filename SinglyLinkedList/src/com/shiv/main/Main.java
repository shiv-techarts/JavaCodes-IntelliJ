/**
 * Created by shiv on 23/12/16.
 */
package com.shiv.main;

import com.shiv.singlylinkedlist.SLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SLinkedList<String> list = new SLinkedList<>();
        list.addEnd("Shiv");
        list.addEnd("Rakesh");
        list.addEnd("Pooja");
        list.addEnd("Sumit");
        list.addEnd("Shubham");

        list.printList();
        System.out.println(list.getSize());

        //list.remove("Deeksha");

        list.removeLast();

        list.printList();
        System.out.println(list.getSize());

        list.clearList();

        LinkedList<String> newList = new LinkedList<>();
        newList.add("shiv");
        newList.add("rakesh");
        newList.add("pooja");
        newList.add("sumit");
        newList.add("shubham");

        for (String i : newList) {
            System.out.println(i);
        }

    }
}
