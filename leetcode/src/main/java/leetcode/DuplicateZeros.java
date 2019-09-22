package leetcode;

import java.util.Arrays;

/**
 * 1089. 复写零
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/22 21:09
 * @USE :
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int[] m = new int[arr.length*2];
        for (int i=0,j=0;i<arr.length;i++,j++){
            m[j] = arr[i];
            if(arr[i] == 0){
                m[j+1] = 0;
                j++;
            }
        }
        arr = Arrays.copyOfRange(m,0,arr.length);
        System.out.println(1);
    }

    public static void main(String[] args) {
        int []a = {1,0,2,3,0,4,5,0};
        new DuplicateZeros().duplicateZeros(a);
    }
}
