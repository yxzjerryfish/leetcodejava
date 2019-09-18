package leetcode;

/**
 * 191. 位1的个数.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-18
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        String m = Integer.toBinaryString(n);
        char [] ls = m.toCharArray();
        Integer flag = 0;
        for (char l:ls){
            if( l == '1') flag++;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(new HammingWeight().hammingWeight(Integer.MAX_VALUE));
    }
}