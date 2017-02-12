/**
 * Shiv Pratap Singh
 * 29 Dec 2016
 * Writing A Name with Only initials
 */
package com.shiv.series;

import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner cin = new Scanner(System.in); // Creating a input Object
        String name = cin.nextLine(); // Taking a String Input as User

        char nameArr[] = name.toCharArray(); // Converting name string to character array
        int sizeOfName = name.length(); // Taking Name length

        for(int i = 0; i < sizeOfName; i++) { // Loop for analysing each character
            if(nameArr[i] != ' ') { // Checking for character to be a valid
                String ch;
                if(i == 0) { // Checking for first character
                    ch = nameArr[i] + "";
                    System.out.print(ch.toUpperCase()); // Printing in UpperCase
                } else if(nameArr[i - 1] == ' ') { // Checking if previous character is space or not
                    ch = nameArr[i] + "";
                    System.out.print(ch.toUpperCase()); // Printing in UpperCase
                } else {
                    //ch = "";
                }
            }
        }
    }
}
