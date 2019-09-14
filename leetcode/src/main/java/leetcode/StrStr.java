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
        char[] h = haystack.toCharArray();
        char [] n = needle.toCharArray();
        if (needle.length() == 0 ) return 0;
        if(haystack.length() < needle.length()) return -1;
        for (int i=0;i<h.length - n.length+1;i++){
            for (int j = 0;j<n.length;j++){
                if (h[i+j] != n[j] ) break;
                if (j==n.length-1) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        System.out.println(new StrStr().strStr(a,b));
    }
}
