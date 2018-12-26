package datastructure;

/*
 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 * Store all the sorted data into one of the databases.
 */
/**
 * Author: Papri Barua
 */

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(4);
		arrlist.add(5);
		arrlist.add(28);
		arrlist.add(1);
		arrlist.add(3);
		arrlist.add(20);
		arrlist.add(7);
		arrlist.add(9);

		/* For Each Loop*/
		System.out.print("\nData is retrieved (after insertion) from ArrayList using For-Each loop: ");
		for (Integer num : arrlist) {
			System.out.print(" " + num);
		}

		Collections.sort(arrlist);

		/* Iterator*/
		System.out.print("\nData is retrieved (after sorting) from ArrayList using Iterator: ");
		Iterator iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.print(" " + iter.next());
		}

		arrlist.remove(4);

		/* While Loop*/
		System.out.print("\nData is retrieved (after deletion) from ArrayList using While Loop: ");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.print(" " + arrlist.get(count));
			count++;
		}

		System.out.println("\n");


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		List<String> aValue = new ArrayList<String>();

		try {
			connectToSqlDB.insertDataFromArrayListToSqlTable_1(arrlist, "arraylist", "list");
			aValue = connectToSqlDB.readDataBase("arraylist", "list");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Data is reading from the Table (arraylist) and displaying to the console");

		for (String st : aValue) {
			System.out.print(st + " ");
		}

	}
}
