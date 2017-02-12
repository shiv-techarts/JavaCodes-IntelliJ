package com.shiv.stringmanipulation;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String name1 = " Shiv Pratap Singh ";
        String name2 = "Pooja Maan";

        String test = "";
        //test = name1.concat(" " + name2);


        Random rand = new Random();
        int value = rand.nextInt(100);

        System.out.println(value + " String is: " + test);

        String s = "Shiv";

        System.out.println(s.toString());

        s = "Singh";

        System.out.println(s.toString());


    }
}
