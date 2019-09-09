package leetcode;


import java.util.Iterator;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 414. 第三大的数.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-09
 */
public class ThirdMax {
    public int thirdMax(int[] nums) {
        HashSet set = new HashSet();
        for (int num:nums){
            set.add(num);
        }
        int i = Integer.MIN_VALUE; // 第一大
        int j = Integer.MIN_VALUE; // 第二大
        int k = Integer.MIN_VALUE; // 第三大
        for (int p = 0 ;p<nums.length;p++){
            // 如果大于第三大，那么逐级上传
            int m = nums[p];
            if(m>k){
                if(m>j){
                    if(m>i){
                        k = j;
                        j = i;
                        i = m;
                    } else if(m<i){
                        k = j;
                        j = m;
                    }
                } else if (m < j){
                  k = m;
                }
            }
        }
        return set.size()<3?i:k;
    }

    public static void main(String[] args) {
        int [] a = {1,2,-2147483648};
        System.out.println(new ThirdMax().thirdMax(a));
    }
}

