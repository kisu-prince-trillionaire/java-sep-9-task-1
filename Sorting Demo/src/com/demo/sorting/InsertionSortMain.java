package com.demo.sorting;

public class InsertionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 5, 6 };
		  
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(arr);
        System.out.println("Sorted Array after Insertion Sort is ");
        obj.printArray(arr);

	}

}
