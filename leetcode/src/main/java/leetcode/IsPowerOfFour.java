package leetcode;

/**
 * 342. 4的幂.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-19
 */
public class IsPowerOfFour {
    public boolean isPowerOfFour(int num) {
        return num>0 && (num&(num-1))==0 && (num&0xaaaaaaaa)==0;
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfFour().isPowerOfFour(16));
    }
}