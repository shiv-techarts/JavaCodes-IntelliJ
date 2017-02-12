package com.shiv.Main;

import com.shiv.doublylinkedlist.DLinkedList;

public class Main {

    public static void main(String[] args) {
        DLinkedList<String> dlist = new DLinkedList<>();
        dlist.add("Shiv");
        dlist.add("Pooja");
        dlist.add("Rakesh");
        dlist.add("Sumit");
        dlist.add("Shubham");

        dlist.printList();
        System.out.println(dlist.getSize());

        dlist.remove("Shiv");

        dlist.printList();
        System.out.println(dlist.getSize());
    }
}
