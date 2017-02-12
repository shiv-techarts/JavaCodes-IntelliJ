package com.shiv.singlylinkedlist;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by shiv on 23/12/16.
 */
public class SLinkedList<T> {
    private SNode<T> head;
    private SNode<T> tail;
    private int size;

    public SLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return ( ( size == 0 ) ? true : false );
    }

    public void clearList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFront(T data) {
        SNode<T> temp = new SNode<T>(data);

        if(head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.setNext(head);
            head = temp;
        }

        size++;
    }

    public void addEnd(T data) {
        SNode<T> temp = new SNode<T>(data);

        if(head == null) {
            head = temp;
        } else {
            tail.setNext(temp);
        }
        tail = temp;
        size++;
    }

    public void remove(T data) {
        if(!isEmpty()) {

            if(head.equals(tail)) {
                head = null;
                tail = null;
            } else if(head.getData().equals(data)) {
                head = head.getNext();
            } else {
                SNode<T> curr = head;
                SNode<T> trail = null;

                while (curr != null) {
                    if(curr.getData().equals(data)) {
                        trail.setNext(curr.getNext());
                        break;
                    } else {
                        trail = curr;
                        curr = curr.getNext();
                    }
                }
                if(curr == null) {
                    System.out.println("Element Not Found.");
                    size++;
                }
            }

            size--;
        } else {
            System.out.println("List is Empty.");
        }
    }

    public void removeFirst() {
        if(!isEmpty()) {
            if(head.equals(tail)) {
                head = null;
                tail = null;
            } else {
                head = head.getNext();
            }

            size--;
        } else {
            System.out.println("List is Empty.");
        }
    }

    public void removeLast() {
        if(!isEmpty()) {
            if(head.equals(tail)) {
                head = null;
                tail = null;
            } else {
                SNode<T> curr = head;

                while(curr.getNext() != tail) {
                    curr = curr.getNext();
                }

                curr.setNext(null);
                tail = curr;
            }

            size--;
        } else {
            System.out.println("List is Empty.");
        }
    }

    public void printList() {
        enumerate(head);
    }

    private void enumerate(SNode<T> curr) {
        if(curr == null) {
            return;
        } else {
            System.out.println(curr.getData());
            enumerate(curr.getNext());
        }
    }
}
