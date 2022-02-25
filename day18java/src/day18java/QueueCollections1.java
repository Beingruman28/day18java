package day18java;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<>();

		
		for (int i = 0; i < 5; i++)                              // Adds elements {0, 1, 2, 3, 4} to
			                                                      // the queue
			q.add(i);

		System.out.println("Elements of queue "	+ q);
		
		q.add(5);

		System.out.println("Elements of queue "	+ q);
		
		  q.remove();                                // To remove the head of queue.
		System.out.println("removed element-");

		System.out.println(q);

			int head = q.peek();                                     // To view the head of queue
		System.out.println("head of queue-"	+ head);

		
		int size = q.size();
		System.out.println("Size of queue-"	+ size);
	}
}

