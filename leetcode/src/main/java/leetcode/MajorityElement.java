package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. 求众数.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-04
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int n:nums){
            hashMap.put(n,hashMap.get(n) ==null ? 1 :hashMap.get(n)+1);
        }
        int returnKey = 0;
        int flag = 0;
        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet()) {
            if (entry.getValue() >= flag){
                flag = entry.getValue();
                returnKey = entry.getKey();
            }
        }
        return returnKey;
    }

    public static void main(String[] args) {
        int[] m = {2,2,1,1,1,2,2,3,3,3,3,3,3,3};
        System.out.println(new MajorityElement().majorityElement(m));

    }
}