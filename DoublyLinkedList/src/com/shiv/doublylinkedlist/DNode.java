package com.shiv.doublylinkedlist;

/**
 * Created by shiv on 23/12/16.
 */
class DNode<T> {
    private DNode<T> previous;

    private T data;

    private DNode<T> next;

    public DNode(T data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public DNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DNode<T> previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }
}
