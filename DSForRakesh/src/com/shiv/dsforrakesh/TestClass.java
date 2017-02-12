package com.shiv.dsforrakesh;

/**
 * Created by shiv on 3/1/17.
 */
public class TestClass<T> {

    private T data;

    public TestClass(T temp) {
        data = temp;
        System.out.println("ctor called");
    }

    public T getData() {
        return data;
    }
}
