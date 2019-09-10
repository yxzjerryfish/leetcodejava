package leetcode;

import java.util.*;

/**
 * 448. 找到所有数组中消失的数字.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-10
 */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        if( nums.length ==0){
            return list;
        }
        int i=0;
        for (int q = 1;q<nums[0];q++){
            list.add(q);
        }
        int j = nums[0];
        while (i<nums.length-1){
            if(nums[i+1] == j+1){
                i++;
                j++;
            } else if(nums[i+1] == j){
                i++;
            } else {
                j++;
                if(j!=0)list.add(j);
            }
        }

        if(nums[nums.length-1]<nums.length){
            for ( i= nums[nums.length-1]+1;i<=nums.length;i++){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] a = {2,2};

        new FindDisappearedNumbers().findDisappearedNumbers(a);
    }
}