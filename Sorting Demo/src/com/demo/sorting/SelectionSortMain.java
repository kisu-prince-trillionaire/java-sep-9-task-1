package com.demo.sorting;

public class SelectionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.selectionSort(arr);
        System.out.println("Sorted array after Selection Sort ");
        ob.printArray(arr);

	}

}
