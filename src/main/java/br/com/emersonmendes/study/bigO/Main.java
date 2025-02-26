package br.com.emersonmendes.study.bigO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // O(1)
        printFirst(List.of("a", "b", "c"));

        // O(n)
        printAllOneByOne(List.of("a", "b", "c"));

        // O(n)
        printAllTwoListOneByOne(List.of("a", "b", "c"), List.of("a", "b", "c"));

        // O(n)
        printEachMatrixElement(
            new String[][]{
                new String[]{"a", "b", "c"},
                new String[]{"d", "e", "f"},
                new String[]{"g", "h", "i"}
            }
        );

        // O(n log n)
        sortList(List.of(3, 1, 4, 1, 5, 9, 2, 6, 5));

        // O(n²)
        pairwiseComparison(List.of(3, 1, 4, 1, 5, 9, 2, 6, 5));

    }

    private static void printEachMatrixElement(String[][] matrix) {
        System.out.println("printEachMatrixElement");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    private static void printFirst(List<String> itens) {
        System.out.println("printFirst");
        System.out.println(itens.getFirst());
    }

    private static void printAllOneByOne(List<String> itens) {
        System.out.println("printAllOneByOne");
        for (String item : itens) {
            System.out.println(item);
        }
    }

    private static void printAllTwoListOneByOne(List<String> a1, List<String> a2) {
        System.out.println("printAllTwoListOneByOne");
        for (String item : a1) {
            System.out.println(item);
        }

        for (String item : a2) {
            System.out.println(item);
        }
    }

    // O(n log n)
    private static void sortList(List<Integer> list) {
        System.out.println("sortList (O(n log n))");
        List<Integer> mutableList = new ArrayList<>(List.copyOf(list));
        Collections.sort(mutableList); // Ordenação O(n log n)
        System.out.println(mutableList);
    }

    // O(n²)
    private static void pairwiseComparison(List<Integer> list) {
        System.out.println("pairwiseComparison (O(n²))");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                System.out.println("Comparando " + list.get(i) + " com " + list.get(j));
            }
        }
    }

}
