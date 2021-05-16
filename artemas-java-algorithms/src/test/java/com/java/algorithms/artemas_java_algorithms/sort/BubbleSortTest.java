package com.java.algorithms.artemas_java_algorithms.sort;

import io.vavr.collection.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.vavr.collection.List.range;
import static java.util.Arrays.stream;
import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    void setup() {
        bubbleSort = new BubbleSort();
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
        List<Integer> listOfNumbers = range(0, 1000);
//        List<Integer> listOfNumbers = range(0, 100000); <-- TAKES ABOUT 18 SECONDS
        int[] input = stream(listOfNumbers.shuffle().toJavaArray()).mapToInt(number -> (int) number).toArray();
        int[] expected = stream(listOfNumbers.toJavaArray()).mapToInt(number -> (int) number).toArray();

        int[] result = bubbleSort.sort(input);

        assertThat(result)
                .hasSize(1000)
                .containsExactly(expected);
    }
}