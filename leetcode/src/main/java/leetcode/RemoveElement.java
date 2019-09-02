package leetcode;

/**
 * 第27题.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-02
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for (int j =0;j<nums.length;j++){
            if (nums[j] != val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int [] a = {3,3,3,3};
        System.out.println(new RemoveElement().removeElement(a,3));
    }

}