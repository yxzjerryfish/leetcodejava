package leetcode;

/**
 * 58. 最后一个单词的长度
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/13 20:40
 * @USE :
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char []c = s.trim().toCharArray();
        if (c.length == 0 ){
            return 0;
        }
        int sum = 0;
        for (int i=0;i<c.length;i++){
            sum ++;
            if (c[i] ==' '){
                sum = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "World World World2 ";
        System.out.println(new LengthOfLastWord().lengthOfLastWord(s));
    }
}
