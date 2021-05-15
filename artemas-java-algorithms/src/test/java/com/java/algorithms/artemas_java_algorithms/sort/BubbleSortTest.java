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
    @DisplayName("Should result given two numbers in the array are already sorted")
    void whenTwoNumbersAreAlreadySorted() {
        int[] input = {7, 8};

        int[] result = bubbleSort.sort(input);

        assertThat(result).containsExactly(7, 8);
    }
}