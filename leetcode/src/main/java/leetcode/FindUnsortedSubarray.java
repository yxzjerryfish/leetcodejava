package leetcode;

import java.util.Arrays;

/**
 * 581. 最短无序连续子数组.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-10
 */
public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
//        Arrays.sort(nums);
        int []nums1 =new int[nums.length];
        for (int i=0;i<nums.length;i++){
            nums1[i] = nums[i];
        }
        Arrays.sort(nums1);
        int m = nums.length,n=nums.length-1;
        int i=0;
        for (;i<nums.length;i++){
            if (nums[i] == nums1[i]){m--;}
            else break;
        }

        for (int j = 0;j<nums.length-i;j++){
            if (nums[n-j] == nums1[n-j]){m--;}
            else break;
        }


        return m;
    }

    public static void main(String[] args) {
        int []a = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(new FindUnsortedSubarray().findUnsortedSubarray(a));
    }
}