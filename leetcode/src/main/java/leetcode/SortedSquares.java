package leetcode;

import java.util.Arrays;


/**
 * 977. 有序数组的平方.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-03
 */
public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        int []n = new int[A.length];
       for (int i=0;i<A.length;i++){
           n[i] = A[i]*A[i];
       }
       Arrays.sort(n);
        return n;
    }

    public static void main(String[] args) {
        int [] m = {-3,-2,1,4};
        new SortedSquares().sortedSquares(m);
    }
}