package math.problems;

/*
 * Find list of Prime numbers from number 2 to 1 million.
 * Try the best solution as possible.Which will take less CPU life cycle.
 * Out put number of Prime numbers on the given range.
 *
 *
 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
 *
 */
/**
 * Author: Papri Barua
 */

import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;


public class PrimeNumber {

	public static void main(String[] args) {

		// initialize and declare here.
		int count = 0;
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		System.out.print("2 ");
		for (int i = 2; i < 10000; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					count++;
					if (count == i - 2) {

						System.out.print(i + " ");

						arr.add(i);
					}
				}
			}
			count = 0;
		}

		System.out.println("");

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		List<String> returnData = new ArrayList<String>();

		try {
			connectToSqlDB.insertDataFromArrayListToSqlTable_1(arr, "primenumber", "prime");
			returnData = connectToSqlDB.readDataBase("primenumber", "prime");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Data is reading from the Table (primenumber) and displaying to the console");

		for (String st : returnData) {
			System.out.print(st + " ");
		}
	}
}
