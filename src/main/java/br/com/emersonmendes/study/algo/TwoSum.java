package br.com.emersonmendes.study.algo;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        var result = new int[2];
        for(var i = 0; i < nums.length; i++){
            int num = nums[i];
            var complement = target - num;
            if(map.containsKey(num)){
                result[0] = map.get(num);
                result[1] = i;
            } else {
                map.put(complement, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3,2,4}, 6);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
