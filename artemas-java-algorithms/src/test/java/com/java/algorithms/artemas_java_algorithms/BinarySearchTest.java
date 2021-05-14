package com.java.algorithms.artemas_java_algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {
	
	private final static int FIRST_INDEX = 0;

	/**
	 * This Test will just run the
	 * binarySearch() method over a
	 * sorted array.
	 */
	@Test
	void searchArrayTest(){

		//sorted array to be Binary Searched.
		int[] arr = {1,2,5,10,100,300,400,500,900};
		int lastIndex = arr.length;
		int valueToSearchFor = 500;

		//initialize the BinarySearch Object to access our method.
		BinarySearch bs = new BinarySearch();

		//the placeholder to hold the 'int' value index 
		int binaryPosition = bs.binarySearch(arr, FIRST_INDEX, lastIndex, valueToSearchFor);

		//validation
		assertThat(7).isEqualTo(binaryPosition);
		System.out.println("searchArrayTest()");
		System.out.println("Index of the `x` value (500) is located at index " + binaryPosition);

	}
	
	
	/**
	 * This test will run the 
	 * binarySearch() method over a
	 * List which will be sorted
	 */
	@Test
	void searchListTest(){
		
		ArrayList<Integer> randomList = new ArrayList<>();
		//Empty Integer array to store list values from RandomList
		Integer[] arrayInt = {};
		Integer[] unsortedArr = {1,6,2,7,44,600,54,70,55,90,100};
		
		//add arrays to the List<Integer>
		randomList.addAll(Arrays.asList(unsortedArr));
		
		//get the ArrayList sorted.
		randomList = sortList(randomList);
		
		//convert list to array
		Integer[] integerArray = randomList.toArray(arrayInt);
		int[] arrayInput = toPrimitive(integerArray);
		
		//int[] arr = toPrimitive(integerArray);
		int lastIndex = arrayInput.length;
		int valueToSearchFor = 100;
		
		//initialize the BinarySearch Object to access our method.
		BinarySearch bs = new BinarySearch();
		
		//the placeholder to hold the 'int' value index 
		int binaryPosition = bs.binarySearch(arrayInput, FIRST_INDEX, lastIndex, valueToSearchFor);
		
		//validation
		assertThat(9).isEqualTo(binaryPosition);
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
	ArrayList<Integer> sortList(ArrayList<Integer> list){
		
		System.out.println("sortList(ArrayList<Integer> list)");
		System.out.println("Unsorted List passed in: " + list);
		
		//sort List passed in.
		Collections.sort(list);

		System.out.println("returned Sorted List");
		System.out.println("List returned as: " + list);
		
		//return sorted list.
		return list;
	}
	
	// Convert Integer[] to int[]
	static int[] toPrimitive(Integer[] IntegerArray) {

		int[] result = new int[IntegerArray.length];
		for (int i = 0; i < IntegerArray.length; i++) {
			result[i] = IntegerArray[i].intValue();
		}
		return result;
	}

}
