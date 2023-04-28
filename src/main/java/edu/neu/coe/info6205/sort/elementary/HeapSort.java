package edu.neu.coe.info6205.sort.elementary;

import edu.neu.coe.info6205.sort.Helper;
import edu.neu.coe.info6205.sort.SortWithHelper;

public class HeapSort<X extends Comparable<X>> extends SortWithHelper {

    public HeapSort(Helper<X> helper) {
        super(helper);
    }

    private void maxHeap(X[] array, int heapSize, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;
        if (left < heapSize && array[left].compareTo(array[largest]) > 0) {
            largest = left;
        }
        if (right < heapSize && array[right].compareTo(array[largest]) > 0) {
            largest = right;
        }
        if (largest != index) {
            swap(array, index, largest);
            maxHeap(array, heapSize, largest);
        }
    }

    private void swap(Object[] array, int i, int j) {
        X temp = (X) array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public void sort(Object[] xs, int from, int to) {
        buildMaxHeap(xs, from, to);
        for (int i = to - 1; i >= from + 1; i--) {
            swap((X[]) xs, from, i);
            maxHeap(xs, from, i, from);
        }
    }

    private void buildMaxHeap(Object[] xs, int from, int to) {
        for (int i = (to - from) / 2 + from - 1; i >= from; i--) {
            maxHeap(xs, from, to, i);
        }
    }

    private void maxHeap(Object[] xs, int from, int to, int i) {
        int left = 2 * (i - from) + 1 + from;
        int right = 2 * (i - from) + 2 + from;
        int largest = i;
        if (left < to && compare(xs[left], xs[largest]) > 0) {
            largest = left;
        }
        if (right < to && compare(xs[right], xs[largest]) > 0) {
            largest = right;
        }
        if (largest != i) {
            swap(xs, i, largest);
            maxHeap(xs, from, to, largest);
        }
    }

    private static int compare(Object x1, Object x2) {
        if (x1 == null && x2 == null) {
            return 0;
        }
        if (x1 == null) {
            return -1;
        }
        if (x2 == null) {
            return 1;
        }
        return ((Comparable) x1).compareTo(x2);
    }

    @Override
    public void postProcess(Object[] xs) {
        // No post process for heapsort - Sai Tej Sunkara
    }
}
