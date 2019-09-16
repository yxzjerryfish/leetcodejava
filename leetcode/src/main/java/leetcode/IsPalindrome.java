package leetcode;

/**
 * 9. 回文数.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-12
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] c =s.toCharArray();
        for (int i=0,j=c.length-1;i<c.length;i++,j--){
            if(c[i]!=c[j])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(-1));
    }
}