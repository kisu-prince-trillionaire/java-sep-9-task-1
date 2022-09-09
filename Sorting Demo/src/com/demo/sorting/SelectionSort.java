package com.demo.sorting;

public class SelectionSort {
	public void selectionSort(int arr[]) {
        int n = arr.length;
        int temp;
 
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                	temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
    }
 
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]+" ");
    }

}
