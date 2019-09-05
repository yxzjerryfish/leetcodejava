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
        int flag = 0;
        for (int i=0;i<nums.length;i++){
            int changetag = 0;
            if(i<k){
                changetag = nums[i];
                nums[i] = nums[nums.length - k + i];
                nums[nums.length - k + i] = changetag;
            } else {
                
            }
        }
        System.out.println(1);

    }

    public void ratate(int []nums,int start,int k){

    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        new Rorate().rotate(a,2);
    }
}