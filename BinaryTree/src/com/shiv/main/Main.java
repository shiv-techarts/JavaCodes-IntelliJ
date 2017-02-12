package com.shiv.main;

import com.shiv.binarytree.BinaryTree;

public class Main {

    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<>();

        tree.add("Shiv");
        tree.add("Rakesh");
        tree.add("Pooja");
        tree.add("Sumit");
        tree.add("Shubham");
        tree.add("Prabhat");

        tree.printTree();
        System.out.println("\n ================================\n" +
                tree.find("Shubham") +
                "\n ================================\n");

        System.out.println(tree.remove("Sumit") + "\n");
        tree.printTree();
    }
}
