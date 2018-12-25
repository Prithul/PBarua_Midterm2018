package math.problems;

/*
 * Write java solution to find the lowest number from this array.
 * Use one of the databases from mysql or mongodb to store and to retrieve.
 */

import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {

		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		//find lowest number from the array
		System.out.print("Given Array: ");
		for(int in : array){
			System.out.print(" " + in);
		}

		System.out.println("\nLowest Number: : " + getLowest(array,26));

		// convert array to arrayList
		List<Integer> list = new ArrayList<Integer>();

		for(int i : array){
			list.add(i);
		}
		System.out.println("My arraylist: " + list);


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		List<String> lowestValue = new ArrayList<String>();

		try {
			connectToSqlDB.insertDataFromArrayListToSqlTable_1(list, "lowestnumber", "number");
			lowestValue = connectToSqlDB.readDataBase("lowestnumber", "number");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Data is reading from the Table (lowestnumber) and displaying to the console");

		for (String st : lowestValue) {
			System.out.print(st + " ");
		}
	}

	public static int getLowest(int[] a, int total){
		int temp;
		for (int i = 0; i < total; i++)
		{
			for (int j = i + 1; j < total; j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[0];
	}

}
