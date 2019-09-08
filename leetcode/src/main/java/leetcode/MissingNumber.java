package leetcode;

import java.util.Arrays;

/**
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/8 17:25
 * @USE :
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for (;i<nums.length;i++){
            if(i != nums[i]) return i;
        }
        return i;
    }
}
