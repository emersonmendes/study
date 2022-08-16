package br.com.emersonmendes.study.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

//        System.out.println(n);
//        System.out.println(queries);

        List<List<Integer>>  computation = new ArrayList<>();
        List<Integer>  result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            computation.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> q = queries.get(i);

            if (q.get(0) == 1) {
                computation.get((q.get(1) ^ lastAnswer) % n).add(q.get(2));
            } else {
                List<Integer> seq = computation.get((q.get(1) ^ lastAnswer) % n);
                lastAnswer = seq.get(q.get(2) % seq.size());
                result.add(lastAnswer);
            }
        }

        return result;

    }

    public static void main(String[] args) {

        /**
         * 2 5
         * 1 0 5
         * 1 1 7
         * 1 0 3
         * 2 1 0
         * 2 1 1
         */

        List<List<Integer>> queries = new ArrayList<>();
//        queries.add(Arrays.asList(2, 5));
        queries.add(Arrays.asList(1, 0, 5));
        queries.add(Arrays.asList(1, 1, 7));
        queries.add(Arrays.asList(1, 0, 3));
        queries.add(Arrays.asList(2, 1, 0));
        queries.add(Arrays.asList(2, 1, 1));

        System.out.println(dynamicArray(2, queries));

    }

}
