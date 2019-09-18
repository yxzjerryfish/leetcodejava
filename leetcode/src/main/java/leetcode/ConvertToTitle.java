package leetcode;

/**
 * 168. Excel表列名称.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-18
 */
public class ConvertToTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n>26){
            char c;
            if(n%26 == 0) {
                c = 'Z';
                n = n /26 -1;
            }
            else {
                c = (char) (n%26 + 64);
                n = n/26;
            }
            sb.append(c);
        }
        sb.append((char)(n+64));
        return String.valueOf(sb.reverse());
    }

    public static void main(String[] args) {
        System.out.println(new ConvertToTitle().convertToTitle(52));
    }
}