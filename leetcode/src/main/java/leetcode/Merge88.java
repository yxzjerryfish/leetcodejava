/*
 * Copyright (c) 2019. Beyondsoft Corporation.
 * All Rights Reserved.
 *
 * BEYONDSOFT CONFIDENTIALITY
 *
 * The information in this file is confidential and privileged from Beyondsoft Corporation,
 * which is intended only for use solely by Beyondsoft Corporation.
 * Disclosure, copying, distribution, or use of the contents of this file by persons other than Beyondsoft Corporation
 * is strictly prohibited and may violate applicable laws.
 */

package leetcode;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-16
 */
public class Merge88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m;i<m+n;i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int []a ={1,2,3,0,0,0};
        int []b = {2,5,6};

        new Merge88().merge(a,3,b,3);
    }
}