package leetcode;

/**
 * 69. x 的平方根
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/15 14:43
 * @USE :
 */
public class MySqrt {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(11));
    }
}
