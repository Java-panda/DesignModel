package com.panda.behaver.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort sort = new Sort(new BubbleSort());
        int[] array = new int[]{3, 5, 7, 1, 4, 2, 6, 9, 8, 0};
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
