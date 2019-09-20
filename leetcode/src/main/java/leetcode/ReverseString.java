package leetcode;

import java.util.ArrayList;

/**
 * 344. 反转字符串.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-20
 */
public class ReverseString {
    public void reverseString(char[] s) {

        if (s.length == 1 || s.length ==0) return;
        int m  = s.length -1,n=0 ;
        while (m >= n){
            char x= s[m];
            s[m] = s[n];
            s[n] = x;
            m--;n++;
        }
        System.out.println(1);
    }

    public static void main(String[] args) {
        char []a ={'h','e','l','l','o'};
        new ReverseString().reverseString(a);
    }
}