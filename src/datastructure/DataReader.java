package datastructure;

/*
 * User API to read the below textFile and print to console.
 * Use BufferedReader class.
 * Use try....catch block to handle Exception.
 *
 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
 *
 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
 * order from LinkedList and retrieve as FILO order from Stack.
 *
 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
 * Use For Each loop/while loop/Iterator to retrieve data.
 */
/**
 * Author: Papri Barua
 */

import databases.ConnectToSqlDB;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws IOException {

		try {
			String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

	//		File file = new File("C:\\Users\\Papri.Barua\\IdeaProjects\\MidtermNovember2018\\src\\data\\self-driving-car.txt");

			BufferedReader br = new BufferedReader(new FileReader(textFile));

			Stack<String> stack = new Stack<>();
			LinkedList<String> list = new LinkedList<String>();


			// Read lines from file.
			while (true) {
				String line = br.readLine();

				System.out.println(line);

				if (line == null) {
					break;
				}
				// Split line on space
				String[] parts = line.split(" ");

				for (String part : parts) {

					stack.push(part);
					list.add(part);
				}
			}

			br.close();

			// Stack
			System.out.println("\nTop word on the Stack: " + stack.peek());

			System.out.print("Found the word 'steps!' in the position: ");
			System.out.println(stack.search("steps!"));

			System.out.println("\nRetrieve the words by Stack are as below:\n");

     		while(!stack.isEmpty()){
				System.out.println(stack.pop());
			}

			// LinkedList
			System.out.println("\nRetrieve the words by LinkedList are as below: \n");

			Iterator it2 = list.iterator();
			while(it2.hasNext()){
				System.out.println(it2.next());
			}

		}catch (Exception e){

			System.out.println("File Not Found!");
		}

        // Database.................

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        try{
			String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
			BufferedReader br = new BufferedReader(new FileReader(textFile));

			while (true) {

				String line = br.readLine();

				connectToSqlDB.insertDataFromStringToSqlTable(line, "datareader", "data");

				if (line == null) {
					break;
				}
			}

			br.close();
			connectToSqlDB.readDataBase_1("datareader", "data");

	}catch (Exception e){

		System.out.println("File Not Found!");
	}

	}   // main ends

}  // class ends


