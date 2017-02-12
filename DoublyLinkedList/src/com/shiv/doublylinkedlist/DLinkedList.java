package com.shiv.doublylinkedlist;

/**
 * Created by shiv on 23/12/16.
 */
public class DLinkedList<T> {
    private DNode<T> head;
    private DNode<T> tail;
    private int size;

    public DLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return ( ( size == 0 ) ? true : false );
    }

    public void addFront(T data) {
        DNode<T> temp = new DNode<T>(data);

        if(head == null) {
            tail = temp;
        } else {
            temp.setNext(head);
            head.setPrevious(temp);
        }
        head = temp;
        size++;
    }

    public void addLast(T data) {
        DNode<T> temp = new DNode<T>(data);

        if(head == null) {
            head = temp;
        } else {
            tail.setNext(temp);
            temp.setPrevious(tail);
        }
        tail = temp;
        size++;
    }

    public void add(T data) {
        //DNode<T> temp = new DNode<T>(data);

//        if(head == null) {
//            head = temp;
//            tail = temp;
//        } else {
            addLast(data);
        //}
    }

    public void removeFirst() {
        if(!isEmpty()) {
            head = head.getNext();
            head.getPrevious().setNext(null);
            head.setPrevious(null);
        } else {
            System.out.println("List is Empty.");
        }

        size--;
    }

    public void removeLast() {
        if(!isEmpty()) {
            tail = tail.getPrevious();
            tail.getNext().setPrevious(null);
            tail.setNext(null);
        } else {
            System.out.println("List is Empty.");
        }

        size--;
    }

    public void remove(T data) {
        if(!isEmpty()) {
            if(head.getData().equals(data)) {
                head = head.getNext();
                head.getPrevious().setNext(null);
                head.setPrevious(null);
            } else {

                DNode<T> curr = head;

                while(curr != null) {
                    if(curr.getData().equals(data)) {
                        break;
                    } else {
                        curr = curr.getNext();
                    }
                }
                if(curr == null) {
                    System.out.println("Element Not Found.");
                    size++;
                } else {
                    curr.getPrevious().setNext(curr.getNext());
                    curr.getNext().setPrevious(curr.getPrevious());
                    curr.setNext(null);
                    curr.setPrevious(null);
                    curr = null;
                }
            }

            size--;
        } else {
            System.out.println("List is Empty.");
        }
    }

    public void printList() {
        enumerate(head);
    }

    public void enumerate(DNode<T> curr) {
        if(curr == null) {
            return;
        } else {
            System.out.println(curr.getData());
            enumerate(curr.getNext());
        }
    }
}
