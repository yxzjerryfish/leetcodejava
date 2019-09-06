package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-06
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        Set numSet = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            numSet.add(nums[i]);
        }
        return nums.length!=numSet.size();
    }

    public static void main(String[] args) {
        int [] a = {3,1};
        System.out.println(new ContainsDuplicate().containsDuplicate(a));
    }
}