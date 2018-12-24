package datastructure;

/**
 * Author: Papri Barua
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/*
 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 *
 */

public class UseQueue {

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<String>();

		// add elements in the queue using offer() - return true/false
		q.offer("Monday");
		q.offer("Tuesday");
		boolean flag = q.offer("Wednesday");
		System.out.println("\nWednesday inserted successfully? " + flag);

		System.out.println("Retrieve my queue using for each: ");
        // for each
		for(String myQ:q){

			System.out.println(myQ);
		}

		// add more elements using add() - throws IllegalStateException
		try {
            // add
			q.add("Thursday");

			q.add("Friday");

			q.add("Saturday");

			q.add("Sunday");

			System.out.println("\nRetrieve my queue using while & iterator: ");
			// while with iterator
			Iterator iter = q.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}

		} catch (IllegalStateException e) {

			e.printStackTrace();

		}
		// peek()
		System.out.println("\nPick the head of the queue: " + q.peek());

		String head = null;

		try {

			// remove head - remove()
			head = q.remove().toString();

			System.out.print("\n1) Push out " + head + " from the queue ");

			System.out.println(" and the new head is now: "+ q.element());

		} catch (NoSuchElementException e) {

			e.printStackTrace();

		}

        // remove the head - poll()
		head = q.poll().toString();

		System.out.print("2) Push out " + head + " from the queue");

		System.out.println("and the new head is now: "+ q.peek());

	}

}
