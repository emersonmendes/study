package br.com.emersonmendes.study.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

class SortTest {

    @Test
    void shouldSortWithBubleSort() {

        int[] a = { 5, 2, 1, 10, 7};

        Sort.bubbleSort(a);

        Assertions.assertArrayEquals(new int[]{ 1, 2, 5, 7, 10 }, a);

    }

    @Test
    void shouldSortWithQuickSort() {

        int[] a = { 5, 2, 1, 10, 7};

        Sort.quickSort(a);

        Assertions.assertArrayEquals(new int[]{ 1, 2, 5, 7, 10 }, a);

    }

    @Test
    void shouldSortWithMergeSort() {

        int[] a = { 5, 2, 1, 10, 7};

        Sort.mergeSort(a);

        Assertions.assertArrayEquals(new int[]{ 1, 2, 5, 7, 10 }, a);

    }

    @Test
    void shouldDoSomeTests() {

        long startTime;
        long endTime;
        int[] randomIntsArray;
        int boundLimit = 1000000;

        randomIntsArray = IntStream.generate(() -> new Random().nextInt(boundLimit)).limit(boundLimit).toArray();
        startTime = System.currentTimeMillis();
        Arrays.sort(randomIntsArray);
        endTime = System.currentTimeMillis();
        System.out.println("JavaNativeSort took " + (endTime - startTime) + " milliseconds");

        randomIntsArray = IntStream.generate(() -> new Random().nextInt(boundLimit)).limit(boundLimit).toArray();
        startTime = System.currentTimeMillis();
        Sort.mergeSort(randomIntsArray);
        endTime = System.currentTimeMillis();
        System.out.println("MergeSort took " + (endTime - startTime) + " milliseconds");

        randomIntsArray = IntStream.generate(() -> new Random().nextInt(boundLimit)).limit(boundLimit).toArray();
        startTime = System.currentTimeMillis();
        Sort.bubbleSort(randomIntsArray);
        endTime = System.currentTimeMillis();
        System.out.println("BubleSort took " + (endTime - startTime) + " milliseconds");

        randomIntsArray = IntStream.generate(() -> new Random().nextInt(boundLimit)).limit(boundLimit).toArray();
        startTime = System.currentTimeMillis();
        Sort.quickSort(randomIntsArray);
        endTime = System.currentTimeMillis();
        System.out.println("QuickSort took " + (endTime - startTime) + " milliseconds");

    }

}