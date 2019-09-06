package leetcode;

/**
 * 189. 旋转数组.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-05
 */
public class Rorate {

    public void rotate(int[] nums, int k) {
        while (k-->0){
            int flag = nums[nums.length-1];
            for (int i = 0;i<nums.length;i++){
                int tag = nums[i];
                nums [i] = flag;
                flag =tag;
            }
        }
    }



    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        new Rorate().rotate(a,3);
    }
}