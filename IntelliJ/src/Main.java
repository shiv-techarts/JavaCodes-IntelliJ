import java.util.ArrayList;
import java.util.Scanner;

/**
 * Shiv Pratap Singh
 * Swap Implementation in Java
 * openjdk-8-jdk
 */


public class Main {

    //Swap Function - Call by Reference
    public static void swapValuesByRef(Swap obj) {
        obj.temp = obj.a;
        obj.a = obj.b;
        obj.b = obj.temp;
    }

    /*
    //Swap Function - Call by Values
    public static void swapValuesByCall(int p_a, int p_b) {
        //p_a = p_b + p_a - ( p_b = p_a ); // Swaping without using third variable
        p_a = p_a + p_b;
        p_b = p_a - p_b;
        p_a = p_a - p_b;
    }*/

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Value of A: ");
        int a = cin.nextInt();
        System.out.println("Enter Value of B: ");
        int b = cin.nextInt();

        //For second function
        System.out.println("Enter Value of A: ");
        String aS = cin.next();
        System.out.println("Enter Value of B: ");
        String bS = cin.next();

        //Take values to swap
        Swap<Integer> values = new Swap<Integer>(a, b);

        System.out.println("A: " + values.a + " B: " + values.b);

        swapValuesByRef(values);

        System.out.println("A: " + values.a + " B: " + values.b);

        Swap<String> values2 = new Swap<String>(aS, bS);

        System.out.println("A: " + values2.a + " B: " + values2.b);

        swapValuesByRef(values2);

        System.out.println("A: " + values2.a + " B: " + values2.b);
    }
}
