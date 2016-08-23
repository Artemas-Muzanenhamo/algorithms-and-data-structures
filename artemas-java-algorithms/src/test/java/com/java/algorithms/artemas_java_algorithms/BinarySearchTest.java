package com.java.algorithms.artemas_java_algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author amuzanenhamo
 *This test Suite will test a Binary Search on an Array
 *and also will test a Binary Search on an unsorted List 
 *which will be sorted and then have the Binary Search
 *performed afterwards.
 *
 */
public class BinarySearchTest {
	
	int L = 0;
	private ArrayList<Integer> list;
	
	/**
	 * This Test will just run the 
	 * binarySearch() method over a 
	 * sorted array.
	 */
	@Test
	public void searchArrayTest(){
		
		//sorted array to be Binary Searched.
		int[] arr = {1,2,5,10,100,300,400,500,900};
		int R = arr.length;
		int x = 500;
		
		//initialize the BinarySearch Object to access our method.
		BinarySearch bs = new BinarySearch();
		
		//the placeholder to hold the 'int' value index 
		int binaryPosition = bs.binarySearch(arr, L, R, x);
		
		//validation
		assertEquals(7, binaryPosition);
		System.out.println("searchArrayTest()");
		System.out.println("Index of the `x` value (500) is located at index " + binaryPosition);
		
	}
	
	
	/**
	 * This test will run the 
	 * binarySearch() method over a
	 * List which will be sorted
	 */
	@Test
	public void searchListTest(){
		
		ArrayList<Integer> randomList = new ArrayList<Integer>();
		//Empty Integer array to store list values from RandomList
		Integer[] arrayInt = {};
		Integer[] unsortedArr = {1,6,2,7,44,600,54,70,55,90,100};
		
		//add arrays to the List<Integer>
		randomList.addAll(Arrays.asList(unsortedArr));
		
		//get the ArrayList sorted.
		randomList = sortList(randomList);
		
		//convert list to array
		Integer[] integerArray = randomList.toArray(arrayInt);
		int[] arr = toPrimitive(integerArray);
		
		//int[] arr = toPrimitive(integerArray);
		int R = arr.length;
		int x = 100;
		
		//initialize the BinarySearch Object to access our method.
		BinarySearch bs = new BinarySearch();
		
		//the placeholder to hold the 'int' value index 
		int binaryPosition = bs.binarySearch(arr, L, R, x);
		
		//validation
		assertEquals(9, binaryPosition);
		System.out.println("searchListTest()");
		System.out.println("Index of the `x` value (100) is located at index " + binaryPosition);
		
		
	}
	
	/**
	 * This is a Util method to take in a list
	 * and sort the values in an order so that
	 * a binary search can be performed without
	 * issues.
	 * @param list
	 * @return - a sorted ArrayList<integer> 
	 */
	public ArrayList<Integer> sortList(ArrayList<Integer> list){
		
		System.out.println("sortList(ArrayList<Integer> list)");
		System.out.println("Unsorted List passed in: " + list);
		
		//sort List passed in.
		Collections.sort(list);
		this.list = list;
		
		System.out.println("returned Sorted List");
		System.out.println("List returned as: " + list);
		
		//return sorted list.
		return list;
	}
	
	// Convert Integer[] to int[]
	public static int[] toPrimitive(Integer[] IntegerArray) {

		int[] result = new int[IntegerArray.length];
		for (int i = 0; i < IntegerArray.length; i++) {
			result[i] = IntegerArray[i].intValue();
		}
		return result;
	}

}
