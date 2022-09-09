package com.searching;

public class SearchingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
 
        LinearSearch ls = new LinearSearch();
        int result = ls.linearSearch(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "+ result);

	}

}
