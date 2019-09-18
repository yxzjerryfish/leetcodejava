package leetcode;

/**
 * 231. 2的幂.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-18
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if( n == Integer.MIN_VALUE) return false;
       String m = Integer.toBinaryString(n);
       char [] ls = m.toCharArray();
       Integer flag = 0;
       for (char l:ls){
           if( l == '1') flag++;
       }
       return flag == 1;
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(-2147483648));
    }
}