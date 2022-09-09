package com.searching;

public class BinarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int a[]={1, 3, 4, 5, 6};
		int x = 1;
	    bs.binarySearch(a, x);
	    x = 6;
	    bs.binarySearch(a, x);
	    x = 10;
	    bs.binarySearch(a, x);

	}

}
