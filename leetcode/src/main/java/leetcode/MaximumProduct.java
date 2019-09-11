package leetcode;

import java.util.Arrays;

/**
 * 628. 三个数的最大乘积.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-11
 */
public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0]*nums[1]*nums[nums.length-1];
        return a>b?a:b;
    }
}