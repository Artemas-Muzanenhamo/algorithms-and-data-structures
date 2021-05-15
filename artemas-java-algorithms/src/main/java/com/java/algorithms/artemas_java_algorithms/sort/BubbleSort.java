package com.java.algorithms.artemas_java_algorithms.sort;

public class BubbleSort {
    public int[] sort(int[] input) {
        int firstNumber = input[0];
        int secondNumber = input[1];

        if (firstNumber > secondNumber) {
            return new int[]{secondNumber, firstNumber};
        }

        return input;
    }
}
