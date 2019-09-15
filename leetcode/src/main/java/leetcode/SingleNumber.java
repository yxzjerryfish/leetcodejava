package leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 136. 只出现一次的数字
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/15 14:56
 * @USE :
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            if (set.contains(num)){
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int []a = {4,1,2,1,2};
        System.out.println(new SingleNumber().singleNumber(a));
    }
}
