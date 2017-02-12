package com.shiv.queue;

/**
 * Created by shiv on 26/12/16.
 */
public class ArrayQueue<T> {
    private T[] arrQueue;
    private int size;
    private int head;
    private int tail;
    private int max;

    public ArrayQueue() {
        this.max = 5;
        this.arrQueue = (T[]) new Object[max];
        this.size = 0;
        this.head = 0;
        this.tail = -1;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(T data) {
        if(size == (max - 1)) {
            T[] newArr = (T[]) new Object[size * 2];

            if(size > 0) {
                int targetIndex = 0;

                if(tail < head) {
                    for(int i = head; i < max; i++) {
                        newArr[targetIndex] = arrQueue[i];
                        targetIndex++;
                    }

                    for(int i = 0; i < tail; i++ ) {
                        newArr[targetIndex] = arrQueue[i];
                        targetIndex++;
                    }
                } else {
                    for(int i = 0 ; i <= tail; i++ ) {
                        newArr[targetIndex] = arrQueue[i];
                        targetIndex++;
                    }
                }

                head = 0;
                tail = targetIndex - 1;
                max = size * 2;
            } else {
                head = 0;
                tail = -1;
            }

            arrQueue = newArr;
        }

        if(tail == max - 1) {
            tail = 0;
        } else {
            tail++;
        }

        arrQueue[tail] = data;
        size++;
    }

    public T peek() {
        return arrQueue[head];
    }

    public T dequeue() {
        T data;
        if(size == 0) {
            head = 0;
            throw new ArrayIndexOutOfBoundsException();
        } else {
            data = arrQueue[head];
            head++;

        }
        size--;
        return data;
    }
}
