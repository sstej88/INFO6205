package edu.neu.coe.info6205.sort.elementary;

import edu.neu.coe.info6205.util.Timer;

import java.util.Random;

public class Main {

    public static void callInsertionSortForIntegers(Integer[] array) {
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(array, 0, array.length);
    }
    public static void testRandomElements(int testCases, int elements) {

        int testCasesForRandomElements = testCases;

        Timer timer = new Timer();
        while(testCasesForRandomElements>0) {

            int numberOfElements = elements;
            Integer[] array = new Integer[numberOfElements];

            for(int i=0; i<numberOfElements; i++) {
                array[i] = (int)Math.random();
            }

            callInsertionSortForIntegers(array);

            timer.lap();
            testCasesForRandomElements--;
        }
        timer.pause();
        System.out.println("Testing for Insertion Sort of Random Elements (for n="+testCases+" and number of elements in array="+elements+"): Mean time in milliseconds: "+timer.meanLapTime());
    }

    public static void testReverseOrderedElements(int testCases, int elements) {

        int testCasesForRandomElements = testCases;

        Timer timer = new Timer();
        while(testCasesForRandomElements>0) {

            int numberOfElements = elements;
            Integer[] array = new Integer[numberOfElements];

            int j = numberOfElements;
            for(int i=0; i<numberOfElements; i++) {
                array[i] = j*23;
                j--;
            }

            callInsertionSortForIntegers(array);

            timer.lap();
            testCasesForRandomElements--;
        }
        timer.pause();
        System.out.println("Testing for Insertion Sort of Reverse Ordered Elements (for n="+testCases+" and number of elements in array="+elements+"): Mean time in milliseconds: "+timer.meanLapTime());
    }

    public static void testSemiOrderedElements(int testCases, int elements) {

        int testCasesForRandomElements = testCases;

        Timer timer = new Timer();
        while(testCasesForRandomElements>0) {

            int numberOfElements = elements;
            Integer[] array = new Integer[numberOfElements];

            int j = numberOfElements;
            for(int i=0; i<numberOfElements/2; i++) {
                array[i] = j*23;
                j--;
            }
            for(int i=numberOfElements/2; i<numberOfElements; i++) {
                array[i] = (int)Math.random();
            }

            callInsertionSortForIntegers(array);

            timer.lap();
            testCasesForRandomElements--;
        }
        timer.pause();
        System.out.println("Testing for Insertion Sort of Semi-Ordered Elements (for n="+testCases+" and number of elements in array="+elements+"): Mean time in milliseconds: "+timer.meanLapTime());
    }
    public static void main(String[] args) {
        testRandomElements(6, 10);
        testRandomElements(6, 100);
        testRandomElements(6, 1000);
        testRandomElements(6, 10000);
        System.out.println("----------------------------");
        testReverseOrderedElements(6, 10);
        testReverseOrderedElements(6, 100);
        testReverseOrderedElements(6, 1000);
        testReverseOrderedElements(6, 10000);
        System.out.println("----------------------------");
        testSemiOrderedElements(6, 10);
        testReverseOrderedElements(6, 100);
        testReverseOrderedElements(6, 1000);
        testReverseOrderedElements(6, 10000);
    }
}
