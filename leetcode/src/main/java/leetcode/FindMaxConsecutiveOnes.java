package leetcode;

/**
 * 485. 最大连续1的个数.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-10
 */
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int flag = 0;
        int maxlength = 0;
        for (int num:nums){
            if (num==1){
                flag ++;
            } else {
                flag = 0;
            }
            if(flag > maxlength){
                maxlength = flag;
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int []a ={1};
        System.out.println(new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(a));
    }
}