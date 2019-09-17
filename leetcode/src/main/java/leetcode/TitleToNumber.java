package leetcode;

/**
 * 171. Excel表列序号.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-17
 */
public class TitleToNumber {
    public int titleToNumber(String s) {
        char [] n = s.toCharArray();
        int sum = 0;
        for (char nc:n){
            int m = nc - 64;
            sum = sum*26 + m;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new TitleToNumber().titleToNumber("AB"));
    }
}