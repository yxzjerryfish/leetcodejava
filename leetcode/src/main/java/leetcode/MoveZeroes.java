package leetcode;

/**
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/8 17:40
 * @USE :
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while (j<nums.length){
            if (nums[j]!=0){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while (i++<nums.length){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int [] a = {0,1,0,3,12};
        new MoveZeroes().moveZeroes(a);
        System.out.println(1);
    }
}
