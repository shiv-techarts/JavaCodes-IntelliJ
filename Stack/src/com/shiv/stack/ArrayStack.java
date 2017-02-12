package com.shiv.stack;

import java.util.Objects;

/**
 * Created by shiv on 24/12/16.
 */
public class ArrayStack<T> {
    private T[] stack;
    private int max;
    private int size;

    public ArrayStack() {
        size = 0;
        max = 5;
        stack = (T[]) new Object[max];
    }

    public int getSize() {
        return size;
    }

    public void push(T data) {
        if(size == (max - 1)) {
            max = size * 2;
            T[] newStack = (T[]) new Object[max];
            for(int i = 0; i <= size; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
            newStack = null;
        }
        stack[++size] = data;
    }

    public void pop() {
        if(size == 0) {
            System.out.println("Stack is Empty.");
        } else {
            stack[size] = null;
            size--;
        }
    }

    public void clear() {
        stack = null;
        size = 0;
    }

    public T peek() {
        if(size == 0) {
            System.out.println("Stack is Empty.");
            return null;
        } else {
            return stack[size];
        }
    }
}
