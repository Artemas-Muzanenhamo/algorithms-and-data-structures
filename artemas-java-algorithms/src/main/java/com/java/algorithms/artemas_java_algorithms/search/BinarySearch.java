package com.java.algorithms.artemas_java_algorithms.search;

class BinarySearch {

	int search(int[] input, int valueToSearchFor) {
		if (input.length > 0) {
			if (valueToSearchFor == input[0]) {
				return input[0];
			}

			if (valueToSearchFor == input[input.length - 1]) {
				return input[input.length - 1];
			}
		}

		return 0;
	}
}
