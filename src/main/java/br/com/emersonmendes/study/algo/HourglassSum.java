package br.com.emersonmendes.study.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourglassSum {

    public static int hourglassSum(List<List<Integer>> arr) {

        int max = -63;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = (arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2));
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Integer [][] arr = new Integer[][]{
            { 1, 1 ,1 ,0 ,0 ,0 },
            { 0, 1, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 0, 0 },
            { 0, 0, 2, 4, 4, 0 },
            { 0, 0, 0, 2, 0, 0 },
            { 0, 0, 1, 2, 4, 0 }
        };

        List<List<Integer>> list = new ArrayList<>();

        for (Integer[] i : arr) {
            list.add(Arrays.asList(i));
        }

        System.out.println( hourglassSum(list));

    }


}
