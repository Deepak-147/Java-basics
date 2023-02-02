package com.ldeepak.collections_basic.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

	public static void main(String[] args) {
		
		List<String> myList = List.of("Zebra", "Monkey", "Cat"); // Immutable
//		myList.add("Goat"); // Not allowed
//		Collections.sort(myList); // Not allowed
		
		/****************************************
		 * Creating a Queue (PriorityQueue)
		 ****************************************/
		Queue<String> pq = new PriorityQueue<String>(); // By default min-heap.
		
		/********************
		 * Adding elements: 
		 * add():  Inserts the element if possible. Otherwise throws an exception.
		 * offer(): Inserts the element if possible. Otherwise returns false.
		 ********************/
		pq.add("Dog");
		pq.add("Donkey");
		pq.add("Lion");
		
		System.out.println(pq);
		System.out.println();
		
		/*************************************
		 * Examine the element:
		 * element(): Return, but do not remove, the head of the queue. Otherwise throws an exception.
		 * peek(): Return, but do not remove, the head of the queue. Otherwise returns null.
		 *************************************/
		System.out.println(pq.peek()); // prints Dog
		System.out.println();
		
		/**********************
		 * Removing elements: 
		 * remove(): Remove and return the head of the queue. Otherwise throws an exception.
		 * poll(): Remove and return the head of the queue. Otherwise returns null.
		 **********************/
		System.out.println(pq.poll()); // Removes Dog
		System.out.println(pq.remove()); // Removes Donkey
		System.out.println();
		
		System.out.println(pq);
		System.out.println();
		
		/********************
		 * Iterating queue
		 ********************/
		Iterator<String> itr = pq.iterator();
        while (itr.hasNext()) {
        	System.out.print(itr.next() + " ");
        }
        System.out.println();
        
        // Max Heap
        Queue<String> pq2 = new PriorityQueue<String>(Collections.reverseOrder());
        pq2.add("Dog");
        pq2.add("Donkey");
        pq2.add("Lion");
		
		Iterator<String> itr2 = pq2.iterator();
        while (itr2.hasNext()) {
        	System.out.print(itr2.next() + " ");
        }
		
	}

}
