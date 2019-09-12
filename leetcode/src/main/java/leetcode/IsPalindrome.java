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

/**
 * 9. 回文数.
 *
 * @author yuxiaozhuo@beyondsoft.com
 * @version 1.0
 * @date 2019-09-12
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] c =s.toCharArray();
        for (int i=0,j=c.length-1;i<c.length;i++,j--){
            if(c[i]!=c[j])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(-1));
    }
}