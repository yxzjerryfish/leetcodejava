package leetcode;

/**
 * 28. 实现 strStr()
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/14 20:38
 * @USE :
 */
public class StrStr {
//    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String a = "hello";
        String b = "ms";
        System.out.println(new StrStr().strStr(a,b));
    }
}
