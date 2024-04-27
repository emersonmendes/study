package br.com.emersonmendes.study.other;

public class SmallestNumber {

    public int find(int[] A) {
//        int ans = 0; <- the was here
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < ans) {
                ans = A[i];
            }
        }
        return ans;
    }

}
