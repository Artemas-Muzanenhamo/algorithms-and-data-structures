package com.java.algorithms.artemas_java_algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    void setup() {
        bubbleSort = new BubbleSort();
    }

    @Test
    @DisplayName("Should sort two numbers in the array")
    void sortTwoNumbers() {
        int[] input = {12, 2};

        int[] result = bubbleSort.sort(input);

        assertThat(result).containsExactly(2, 12);
    }

    @Test
    @DisplayName("Should return result given two numbers in the array are already sorted")
    void whenTwoNumbersAreAlreadySorted() {
        int[] input = {7, 8};

        int[] result = bubbleSort.sort(input);

        assertThat(result).containsExactly(7, 8);
    }

    @Test
    @DisplayName("Should return an empty array the input is empty")
    void whenInputIsEmpty() {
        int[] input = {};

        int[] result = bubbleSort.sort(input);

        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("Should return the list of values sorted")
    void testBubbleSort() {
        int[] input = {2, 10, 33, 1, 43, 44, 1, 5, 55, 4};
//        int[] input = {3, 2, 1};

        int[] result = bubbleSort.sort(input);

        assertThat(result)
                .hasSize(10)
                .containsExactly(1, 1, 2, 4, 5, 10, 33, 43, 44, 55);
    }
}