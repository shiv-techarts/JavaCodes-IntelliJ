package com.shiv.stack;

/**
 * Created by shiv on 24/12/16.
 */
public class LinkedStack<T> {
    private Node<T> head;
    private int size;

    public LinkedStack() {
        this.size = 0;
        this.head = null;
    }

    public int getSize() {
        return size;
    }

    public void push(T data) {
        Node<T> temp = new Node<T>(data);
        temp.setNext(head);
        head = temp;
        size++;
    }

    public void pop() {

        if(size == 0) {
            System.out.println("Stack is Empty.");
        }

        head = head.getNext();
        size--;
    }

    public T peek() {

        if(size == 0) {
            System.out.println("Stack is Empty.");
            return null;
        } else {
            return head.getData();
        }
    }
}
