package com.java.algorithms.artemas_java_algorithms;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,6,40,58,70,90,100,400};
		int x = 400;
		int L = 0;
		int R = arr.length;
		
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binarySearch(arr, L, R, x));
		
		
	}
	
	/**
	 * Our Method to perfom the Binary Search
	 * 
	 * @param arr
	 * @param L
	 * @param R
	 * @param x
	 * @return - returns an int value of the index where the value x is located.
	 */
	public int binarySearch(int[] arr, int L, int R, int x)
	{
	    /**
	     * if R index is greater than L (index 0)
	     */
	    if (R >= L)
	    {
	        //get the middle index value
	        int mid = L + (R - L)/2;

	        //if the middle index value = `X` value
	        if(arr[mid] == x)
	        {
	            //return mid since it matches `X` value
	            return mid;
	        }
	        //if the middle index value is > `X` value
	        else if(arr[mid] > x)
	        {
	            //return the array from `L` index up to the mid index - 1.
	            return binarySearch(arr, L, mid - 1, x);
	        }
	        else
	        {
	            //return the array from `mid + 1` index to the `R` index.
	            return binarySearch(arr, mid + 1, R, x);
	        }
	    }
	    else
	    {
	        return -1;
	    }
	}

	public int search(int[] input, int valueToSearchFor) {
		return 0;
	}
}
