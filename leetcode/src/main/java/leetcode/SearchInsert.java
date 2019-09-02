package leetcode;

/**
 * 35.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-02
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for (;i<nums.length;i++){
            if (nums[i] >= target) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        System.out.println(new SearchInsert().searchInsert(a,0));
    }
}