package com.array.TwoSum;

public class TwoSumApp {
    public static void main(String args[]) {
        TwoSum ts = new TwoSum();
        int nums[] = {1, 2, 3, 4, 5, 6};
        int target = 9;
        int[] result = ts.twoSums(nums, target);
        System.out.println("Two Sum: ");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
