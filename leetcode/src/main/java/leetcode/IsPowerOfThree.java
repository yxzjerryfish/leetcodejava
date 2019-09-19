package leetcode;

/**
 * 326. 3的幂.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-19
 */
public class IsPowerOfThree {
    // 整数范围内所有3的幂都是1162261467的约数
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467%n == 0;
    }
}