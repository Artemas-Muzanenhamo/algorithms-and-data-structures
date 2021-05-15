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
	@DisplayName("Should return 0 when the value searched for does not exist")
	void searchArrayOfNothing() {
		int[] input = {};
		int valueToSearchFor = 22;

		int result = binarySearch.search(input, valueToSearchFor);

		assertThat(result).isZero();
	}

	@Test
	@DisplayName("Should return the value searched for given its at the first index")
	void searchArrayAtFirstIndex() {
		int[] input = {40, 22, 14, 5, 55, 77, 100};
		int valueToSearchFor = 40;

		int result = binarySearch.search(input, valueToSearchFor);

		assertThat(result).isEqualTo(valueToSearchFor);
	}

	@Test
	@DisplayName("Should return the value searched for given its at the last index")
	void searchArrayAtLastIndex() {
		int[] input = {40, 22, 14, 5, 55, 77, 100};
		int valueToSearchFor = 100;

		int result = binarySearch.search(input, valueToSearchFor);

		assertThat(result).isEqualTo(valueToSearchFor);
	}

	@Test
	@DisplayName("Should return the value searched")
	void searchArrayAtMiddle() {
		int[] input = {40, 22, 14, 5, 55, 77, 100};
		int valueToSearchFor = 77;

		int result = binarySearch.search(input, valueToSearchFor);

		assertThat(result).isEqualTo(valueToSearchFor);
	}

}
