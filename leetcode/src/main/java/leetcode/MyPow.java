package leetcode;

/**
 * 50. Pow(x, n).
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-16
 */
public class MyPow {
    public double myPow(double x, int n) {
        double m =1;
        if (x == 0 && n != 0)
            return 0;
        if(x!=0 && n ==0) return 1;
        if(x== 1) return 1;
        if(x== -1) {
         if(n%2 == 0)
             return 1;
         else return -1;
        }

        if(n>0)while (n-->0){
            m*=x;
            if (m == 0) break;
        }
        else if (n<0) while (n++<0){
            m*=1/x;
            if (m == 0) break;
        }
        if (x == 0 && n==0){
            throw new RuntimeException();
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(new MyPow().myPow(-1.00000,2147483647));
    }
}


