package com.shiv.main;

import com.shiv.dsforrakesh.TestClass;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//        ArrayList<TestClass> nameArray = new ArrayList<>();
//
//        nameArray.add(0, new TestClass(5));
//        nameArray.add(1, new TestClass(15));
//
//        //TestClass obj = new TestClass(5);
//        System.out.println( nameArray.get(1).data );

        TestClass<Integer> stringTestClass = new TestClass<>(56);

        System.out.println(stringTestClass.getData());

    }
}
