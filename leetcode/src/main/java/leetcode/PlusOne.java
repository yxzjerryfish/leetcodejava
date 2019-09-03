package leetcode;

/**
 * .66
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-03
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int []m = new int[digits.length + 1];
        int []n;
        int flag = 1;
        for (int i=digits.length-1,j=0;i>=0;i--,j++){
            int f = digits[i]+flag ;
            if(f == 10 ){
                m[j] = 0;
                flag = 1;
            } else {
                m[j] = f;
                flag = 0;
            }
        }
        if(flag == 1){
            m[digits.length] = 1;
            n = new int[digits.length+1];
            for (int i=m.length-1,j=0;i>=0;i--,j++){
                n[j] = m[i];
            }
        } else {
            n = new int[digits.length];
            for (int i=digits.length-1,j=0;i>=0;i--,j++){
                n[j] = m[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int []m = {9,9,9,9};
        System.out.println(new PlusOne().plusOne(m));
    }
}