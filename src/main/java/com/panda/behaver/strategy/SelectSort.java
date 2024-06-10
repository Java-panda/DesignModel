package com.panda.behaver.strategy;


public class SelectSort implements ISortStrategy {
    @Override
    public void sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int minIndex = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != j) {
                swap(array, j, minIndex);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
