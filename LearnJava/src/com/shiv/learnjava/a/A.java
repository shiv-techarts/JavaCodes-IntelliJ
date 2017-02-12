package com.shiv.learnjava.a;

import com.shiv.learnjava.b.B;

/**
 * Created by shiv on 23/1/17.
 */
public class A {

    private String nameOfClass;

    public A() {
        System.out.println("A ctor called.");
        nameOfClass = null;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public void printName(B b) { // public void printName(B b = b) { }
        //System.out.println(b.toString());
        System.out.println("printName() -> B class have: " + b.toString() + " " + b.getNameOfClass() + " " + b.getNameOfPerson());
        b.setNameOfClass("C");
        b.setNameOfPerson("Rajshree"); // "null" | null
    }
}
