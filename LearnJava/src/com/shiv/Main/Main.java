package com.shiv.Main;
import com.shiv.learnjava.a.A;
import com.shiv.learnjava.b.B;

public class Main {

    public static void main(String[] args) {
	// write your code here

        A a = new A();
        B b = new B();
        b.setNameOfClass("B");
        b.setNameOfPerson("Rakesh");

        System.out.println("Main() -> B class have: " + b.toString() + " " + b.getNameOfClass() + " " + b.getNameOfPerson());

        a.printName(b);

        System.out.println("Main() -> B class have: " + b.toString() + " " + b.getNameOfClass() + " " + b.getNameOfPerson());

    }
}
