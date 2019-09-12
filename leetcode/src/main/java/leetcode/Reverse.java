package leetcode;

import static java.lang.Math.*;

/**
 * 7. 整数反转.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-12
 */
public class Reverse {
    public int reverse(int x) {
        if(x==0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) return 0;
        // 傻逼leetcode不支持Math
        int m = (int) Math.log10(Math.abs(x));
        int []n = new int[m+1];
        for (int i = 0;i<n.length;i++){
            n[i] = x%10;
            x = x/10;
        }
        Long sum = 0L;
        for (int ns:n){
            sum = (10 *sum)+new Long(ns);
        }
        if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE){
            return 0;
        }
        return sum.intValue();
    }

    public static void main(String[] args) {
        System.out.println(new Reverse().reverse(-2147483648));
    }
}