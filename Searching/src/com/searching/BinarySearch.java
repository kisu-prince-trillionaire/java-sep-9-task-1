package com.searching;

public class BinarySearch {
	public void binarySearch(int a[], int x) {
	    int lo = 0, hi = a.length - 1;
	    
	    while (hi - lo > 1) {
	        int mid = (hi + lo) / 2;
	        if (a[mid] < x) {
	            lo = mid + 1;
	        }
	        else {
	            hi = mid;
	        }
	    }
	    if (a[lo] == x) {
	      System.out.println("Element Found At Index " + lo );
	    }
	    else if (a[hi] == x) {
	        System.out.println("Element Found At Index " + hi );
	    }
	    else {
	        System.out.println("Not Found" );
	    }
	}
}
