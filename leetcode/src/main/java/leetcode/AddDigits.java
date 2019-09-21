package leetcode;

/**
 * 258. 各位相加
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/21 18:49
 * @USE :
 */
public class AddDigits {
    public int addDigits(int num) {
        if(num!=0&&num%9==0) return 9;
        else return num%9;
    }
}
