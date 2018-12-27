package algorithm;

/** Show all the different kind of sorting algorithm by applying into (num array).
 * Display the execution time for each sorting.Example in below.
 *
 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
 *
 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
 */
/*
 * Created by mrahman on 04/02/2018.
 */
/**
 *  Author: Papri Barua
 */

import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Numbers {

	public static void main(String[] args) throws Exception {

		//int [] num = new int[1000000];
		int [] num = new int[1000];
		storeRandomNumbers(num);

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		Sort algo = new Sort();

		// ..................................Selection Sort ....................................
		algo.selectionSort(num);
		System.out.println("Sorted Data Prints Out On Console: ");
		algo.printSortedArray(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("\nTotal Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "selection_num");
			List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "selection_num");
			System.out.println("Selection_Sort: Data Retrieved From Database");
		    printValue(numbers);

		} catch (Exception e) {
			e.printStackTrace();
		}

		int n = num.length;
		randomize(num, n);

		// ..................................Insertion Sort .....................................
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("\nTotal Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "insertion_num");
			List<String> numbers = connectToSqlDB.readDataBase("insertion_sort", "insertion_num");
			System.out.println("Insertion_Sort: Data Retrieved From Database");
			printValue(numbers);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// ......................................Bubble Sort ..............................
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("\nTotal Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "bubble_num");
			List<String> numbers = connectToSqlDB.readDataBase("bubble_sort", "bubble_num");
			System.out.println("Bubble_Sort: Data Retrieved From Database");
			printValue(numbers);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		// ....................................Merge Sort .............................
		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("\nTotal Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "merge_num");
			List<String> numbers = connectToSqlDB.readDataBase("merge_sort", "merge_num");
			System.out.println("Merge_Sort: Data Retrieved From Database");
			printValue(numbers);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// ..................................Quick Sort ....................................
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("\nTotal Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "quick_num");
			List<String> numbers = connectToSqlDB.readDataBase("quick_sort", "quick_num");
			System.out.println("Quick_Sort: Data Retrieved From Database");
			printValue(numbers);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// ..............................Heap Sort ...............................
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("\nTotal Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "heap_num");
			List<String> numbers = connectToSqlDB.readDataBase("heap_sort", "heap_num");
			System.out.println("Heap_Sort: Data Retrieved From Database");
			printValue(numbers);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// .......................................Bucket Sort .........................................
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("\nTotal Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "bucket_num");
			List<String> numbers = connectToSqlDB.readDataBase("bucket_sort", "bucket_num");
			System.out.println("Bucket_Sort: Data Retrieved From Database");
			printValue(numbers);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// .................................Shell Sort ..................................
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("\nTotal Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "shell_num");
			List<String> numbers = connectToSqlDB.readDataBase("shell_sort", "shell_num");
			System.out.println("Shell_Sort: Data Retrieved From Database");
			printValue(numbers);

		} catch (Exception e) {
			e.printStackTrace();
		}

		//Come to conclusion about which Sorting Algo is better in given data set.

		ArrayList<Long> timeList = new ArrayList<Long>(Arrays.asList(selectionSortExecutionTime,insertionSortExecutionTime,
				bubbleSortExecutionTime,mergeSortExecutionTime,quickSortExecutionTime,heapSortExecutionTime,bucketSortExecutionTime,shellSortExecutionTime));

		System.out.println("\nExecution time of all sorting algorithms at a glance: ");

		timeList.forEach(ls -> System.out.println(ls + " milli sec"));


	}  // main ends

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			//num[i] = rand.nextInt(1000000);
			num[i] = rand.nextInt(1000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.print(st + " ");
		}
	}

	}// class ends
