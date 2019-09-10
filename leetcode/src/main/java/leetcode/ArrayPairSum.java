package leetcode;

import java.util.Arrays;

/**
 * 561. 数组拆分 I.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-10
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int []a = {1,4,3,2};
        System.out.println(new ArrayPairSum().arrayPairSum(a));
    }
}