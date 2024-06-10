package com.panda.behaver.strategy;

public class Sort {
    private ISortStrategy sortStrategy;

    public Sort(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] array) {
        this.sortStrategy.sort(array);
    }

    ;
}
