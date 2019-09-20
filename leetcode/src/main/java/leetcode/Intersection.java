package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 349. 两个数组的交集.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-20
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        int [] a = new int[Math.min(nums1.length,nums2.length)];
        int i=0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n:nums1){
            hashSet.add(n);
        }
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int m:nums2){
            hashSet1.add(m);
        }

        for (int h:hashSet1){
            int l = hashSet.size();
            hashSet.add(h);
            if (hashSet.size() == l){
                a[i]=h;
                i++;
            }
        }
        return Arrays.copyOfRange(a,0,i);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        new Intersection().intersection(nums1,nums2);

    }
}