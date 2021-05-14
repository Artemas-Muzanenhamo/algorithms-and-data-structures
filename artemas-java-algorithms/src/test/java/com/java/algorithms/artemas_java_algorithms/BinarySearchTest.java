package com.java.algorithms.artemas_java_algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

	private BinarySearch binarySearch;

	@BeforeEach
	void setup() {
		binarySearch = new BinarySearch();
	}

	@Test
	@DisplayName("Should return the value searched for")
	void searchArrayTest(){
		int[] input = {40, 22, 14, 5, 55, 77, 100};
		int valueToSearchFor = 22;

		int result = binarySearch.search(input, valueToSearchFor);

		assertThat(result).isEqualTo(valueToSearchFor);
	}

}
