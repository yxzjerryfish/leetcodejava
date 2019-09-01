package leetcode;

import java.util.*;

/**
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/8/31 22:41
 * @USE :
 */
public class TwoSum  {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                    result[0] = map.get(target - nums[i]);
                   result[1] = i;
                   return result;
                }
             map.put(nums[i], i);
        }
                return result;
    }

    public static void main(String[] args) {
        int [] m ={3,3};
        int target = 6;

        System.out.println(new TwoSum().twoSum(m,target));
    }
}
