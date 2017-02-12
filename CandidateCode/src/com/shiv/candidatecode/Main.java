package com.shiv.candidatecode;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main {
    /*
     * Complete the function below.
    */

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        int[] ip1 = new int[ip1_size];
        int ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            ip1_item = Integer.parseInt(in.nextLine().trim());
            ip1[ip1_i] = ip1_item;
        }
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3 = Integer.parseInt(in.nextLine().trim());
        output = ball_count(ip1,ip2,ip3);
        System.out.println(String.valueOf(output));
    }


    public static int ball_count(int[] input1,int input2,int input3)
    {
        Arrays.sort(input1);
        int prev = Integer.MAX_VALUE;


        for(int i = 0; i < input1.length ; i++) {
            int total = 0;
            int temp = input3;
            int j = i + 1;
            if( j + temp <= input1.length) {
                while (temp != 0) {
                    total += input1[j];
                    temp--;
                    j++;
                }

                total += input1[i];
                if(total < prev && ( total % input2 ) == 0) {
                    prev = total;
                }
            }
        }

        if(prev == Integer.MAX_VALUE) {
            return -1;
        } else {
            return prev;
        }
    }

}