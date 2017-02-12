package com.shiv.queue;

/**
 * Created by shiv on 26/12/16.
 */
public class LinkedQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedQueue() {
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

    public void enqueue(T data) {
        Node<T> temp = new Node<>(data);
        if(head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.setNext(temp);
            tail = temp;
        }

        size++;
    }

    public T dequeue() {
        T data = null;
        if(head == null) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            data = head.getData();
            head = head.getNext();
        }
        size--;
        return data;
    }

    public T peek() {
        return head.getData();
    }

    public void clear() {
        head = null;
        tail = null;
    }
}
