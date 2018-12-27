package algorithm;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

/*
 * Created by mrahman
 */

/**
 * Author: Papri Barua
 */

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    // ********** 1. Selection **********

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < list.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < list.length; i++) {
                if (list[i] < list[min])
                    min = i;
            }

            int temp = list[min];
            list[min] = list[j];
            list[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    // ********** 2. Insertion **********

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        int temp;
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }

            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;

    }

    // ********** 3. Bubble **********

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int n = list.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list[j-1] > list[j]){
                    //swap elements
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    // ********** 4. Merge **********

    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        Sort obj_merge = new Sort();
        obj_merge.sort_merge(list, 0, list.length-1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    // Method that sorts arr[l..r] using
    // merge()
    void sort_merge(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort_merge(arr, l, m);
            sort_merge(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // ********** 5. Quick **********

    public int [] quickSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        quickSort_again(list, 0, list.length - 1 );

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void quickSort_again(int[] arr, int low, int high)
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }

        if (low >= high){
            return;
        }

        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot)
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                swap_quick (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            quickSort_again(arr, low, j);
        }
        if (high > i){
            quickSort_again(arr, i, high);
        }
    }

    public static void swap_quick (int array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    // ********** 6. Heap **********
    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        Sort obj_heap = new Sort();
        obj_heap.sort_heap(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public void sort_heap(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // ********** 7. Bucket **********

    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        // Calling getMax() method for getting max value
        int max = getMax(list);

        Sort obj_bucket = new Sort();
        obj_bucket.sort_bucket(list,max);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static void sort_bucket(int[] a, int maxVal) {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                a[outPos++]=i;
            }
        }
    }

    // ********** 8. Shell **********

    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        Sort obj_shell = new Sort();
        obj_shell.sort_shell(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    /* Method to sort arr using shellSort */
    int sort_shell(int arr[]) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        return 0;
    }

        public static void printSortedArray ( int[] arrayMain){
            for (int i = 0; i < arrayMain.length; i++) {
                System.out.print(arrayMain[i] + " ");

            }
            System.out.println();
        }

}  // class ends
