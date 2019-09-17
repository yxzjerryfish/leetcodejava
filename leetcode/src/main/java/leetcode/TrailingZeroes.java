package leetcode;

/**
 * 172. 阶乘后的零.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-17
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>=5){
            count += n/5;
            n =n/5;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new TrailingZeroes().trailingZeroes(35));
    }
}