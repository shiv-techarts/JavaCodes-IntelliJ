package com.shiv.main;

import com.shiv.queue.LinkedQueue;
import com.shiv.queue.ArrayQueue;

public class Main {

    public static void main(String[] args) {
	    /*LinkedQueue<String> queue = new LinkedQueue<>();

        queue.enqueue("Shiv");
        queue.enqueue("Pooja");
        queue.enqueue("Rakesh");
        queue.enqueue("Shubham");
        queue.enqueue("Sumit");
        queue.enqueue("Prabhat");

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        try {
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            queue.clear();
            System.out.println(queue.getSize());
        }*/

        ArrayQueue<String> arrQueue = new ArrayQueue<>();

        arrQueue.enqueue("Shiv");
        arrQueue.enqueue("Pooja");
        arrQueue.enqueue("Rakesh");
        arrQueue.enqueue("Shubham");
        arrQueue.enqueue("Sumit");
        arrQueue.enqueue("Prabhat");

        //System.out.println(arrQueue.peek());
        System.out.println(arrQueue.dequeue());
        System.out.println(arrQueue.dequeue());
        System.out.println(arrQueue.dequeue());
        System.out.println(arrQueue.dequeue());
//        System.out.println(arrQueue.dequeue());
//        System.out.println(arrQueue.dequeue());
//        System.out.println(arrQueue.dequeue());
//        System.out.println(arrQueue.dequeue());
//        System.out.println(arrQueue.getSize());

    }
}
