package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {

        //.................Unit Test for Selection Sort................

        int [] unSortedArray1 = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray1);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray1, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        System.out.println("Unit Test for Selection Sort is passed");
        //Now implement Unit test for rest of the soring algorithm...................below


        // .....................Unit Test for Insertion Sort....................

        int [] unSortedArray2 = {6,9,2,5,1,0,4};
        sort.insertionSort(unSortedArray2);
        try {
            Assert.assertEquals(sortedArray, unSortedArray2, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Unit Test for Insertion Sort is passed");


       // .....................Unit Test for Bubble Sort....................

        int [] unSortedArray3 = {6,9,2,5,1,0,4};
        sort.bubbleSort(unSortedArray3);
        try {
            Assert.assertEquals(sortedArray, unSortedArray3, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Unit Test for Bubble Sort is passed");


        // .....................Unit Test for Merge Sort....................

        int [] unSortedArray4 = {6,9,2,5,1,0,4};
        sort.mergeSort(unSortedArray4);
        try {
            Assert.assertEquals(sortedArray, unSortedArray4, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Unit Test for Merge Sort is passed");


        // .....................Unit Test for Quick Sort....................

        int [] unSortedArray5 = {6,9,2,5,1,0,4};
        sort.quickSort(unSortedArray5);
        try {
            Assert.assertEquals(sortedArray, unSortedArray5, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Unit Test for Quick Sort is passed");


        // .....................Unit Test for Heap Sort....................

        int [] unSortedArray6 = {6,9,2,5,1,0,4};
        sort.heapSort(unSortedArray6);
        try {
            Assert.assertEquals(sortedArray, unSortedArray6, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Unit Test for Heap Sort is passed");


        // .....................Unit Test for Bucket Sort....................

        int [] unSortedArray7 = {6,9,2,5,1,0,4};
        sort.bucketSort(unSortedArray7);
        try {
            Assert.assertEquals(sortedArray, unSortedArray7, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Unit Test for Bucket Sort is passed");


        // .....................Unit Test for Shell Sort....................

        int [] unSortedArray8 = {6,9,2,5,1,0,4};
        sort.shellSort(unSortedArray8);
        try {
            Assert.assertEquals(sortedArray, unSortedArray8, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Unit Test for Shell Sort is passed");


    }
}
