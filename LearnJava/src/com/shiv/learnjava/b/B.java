package com.shiv.learnjava.b;

/**
 * Created by shiv on 23/1/17.
 */
public class B {

    private String nameOfClass;
    private String nameOfPerson;

    public B() {
        System.out.println("B ctor called.");
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }
}
