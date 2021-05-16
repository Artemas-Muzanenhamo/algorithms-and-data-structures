package com.java.algorithms.artemas_java_algorithms.sort;

public class BubbleSort {
    public int[] sort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    swapPair(input, i, j);
                }
            }
        }

        return input;
    }

    private void swapPair(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
