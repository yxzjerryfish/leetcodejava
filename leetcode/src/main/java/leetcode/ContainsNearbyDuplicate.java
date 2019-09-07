package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/7 14:58
 * @USE :
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []a = {1,1};
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(a,2));
    }
}
