package leetcode;

import java.util.Arrays;

/**
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/1 17:57
 * @USE :
 */
public class RemoveDuplicates {

    //原数组 nums 的前两个元素被修 1 1 2的入参，可以修改为1 2 2 也可以
    // 并不意味着要截取原数组，比如给
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[number]) {
                number++;
                nums[number] = nums[i];
            }
        }

        return number + 1;
    }

    public static void main(String[] args) {
            int [] a = {1,1,3};
        System.out.println(new RemoveDuplicates().removeDuplicates(a));
    }

}
