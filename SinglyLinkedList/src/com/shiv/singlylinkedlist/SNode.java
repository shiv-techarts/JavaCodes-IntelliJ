package com.shiv.singlylinkedlist;

/**
 * Created by shiv on 23/12/16.
 */
class SNode<T> {
    private T data;
    private SNode<T> next;

    public SNode(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SNode<T> getNext() {
        return next;
    }

    public void setNext(SNode<T> next) {
        this.next = next;
    }
}
