package com.example.leetcode.problems.removeDuplicateSortedArray;

public class RemoveDuplicateSortedArraySolution {

    public int removeDuplicates(int[] nums) {
        int off = 0;
        int res = 1;
        int cm = 1;
        int n = nums.length;

        //edge case
        if (nums.length == 0) {
            return 0;
        }

        while (cm < n) {
            if (nums[cm] == nums[cm - 1]) {
                cm++;
                continue;
            }
            //unique

            nums[off + 1] = nums[cm];
            off++;
            res++;
            cm++;
        }

        return res;
    }
}
