package com.shiv.main;

import com.shiv.stack.LinkedStack;
import com.shiv.stack.ArrayStack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        LinkedStack<String> linkedStack = new LinkedStack<>();

        linkedStack.push("Shiv");
        linkedStack.push("Pooja");

        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.getSize());

        linkedStack.pop();
        System.out.println(linkedStack.peek());

        System.out.println(linkedStack.getSize());

        ArrayStack<String> arrayStack = new ArrayStack<>();

        arrayStack.push("Rakesh");
        arrayStack.push("Rajshree");
        arrayStack.push("Shiv");
        arrayStack.push("Pooja");
        arrayStack.push("Shubham");
        arrayStack.push("Sumit");
        arrayStack.push("Prabhat");
        arrayStack.push("Punetha");
        arrayStack.push("Deeksha");
        arrayStack.push("Vikas");
        arrayStack.push("Ritesh");

        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.getSize());

        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();

        System.out.println(arrayStack.peek());

        System.out.println(arrayStack.getSize());

        arrayStack.clear();

        System.out.println(arrayStack.peek());

        System.out.println(arrayStack.getSize());
*/

        ArrayStack<Integer> postFixCalc = new ArrayStack<>();

        Scanner cin = new Scanner(System.in);
        String input = cin.nextLine();

        char[] ch = input.toCharArray();

        int length = input.length();
        boolean flag = false;

        for (int i = 0; i < length; i++) {
            if(ch[i] >= '0' && ch[i] <= '9') {
                postFixCalc.push(Integer.parseInt(ch[i] + ""));
            } else {
                int first = postFixCalc.peek();
                postFixCalc.pop();
                int second = postFixCalc.peek();

                switch (ch[i]) {
                    case '+': postFixCalc.push(first + second);
                                break;
                    case '-': postFixCalc.push(first - second);
                        break;
                    case '*': postFixCalc.push(first * second);
                        break;
                    case '/': postFixCalc.push(first / second);
                        break;
                    default: System.out.println("Wrong input");
                        flag = true;
                }

                if(flag) {
                    break;
                }
            }
        }
        System.out.println(postFixCalc.peek());
    }
}
