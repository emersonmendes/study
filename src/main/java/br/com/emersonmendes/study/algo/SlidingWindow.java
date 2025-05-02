package br.com.emersonmendes.study.algo;

public class SlidingWindow {

    public static void main(String[] args) {
        int i = longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1});
        System.out.println(i);
    }

    public static int longestSubarray(int[] nums) {
        var left = 0;
        var zeroCount = 0;
        var maxLen = 0;
        for (var right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }

}
