package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 643. 子数组最大平均数 I.
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-09-11
 */
public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        LinkedList<Integer> link = new LinkedList<>();
        double [] sum= new double[nums.length -k +1];
        for (int i=0;i<k;i++){
            link.add(nums[i]);  //初始化
        }

        double flag  = finddouble(link);
        sum[0] = flag;
        for (int i=k;i<nums.length;i++){
            int a = link.removeFirst();
            link.addLast(nums[i]);
            flag = flag - a + nums[i];
            sum[i-k+1] = flag;
        }

        Arrays.sort(sum);
        return sum[sum.length-1]/k;
    }

    private double finddouble(LinkedList<Integer> list){
        double sum = 0;
        for (Integer l:list){
            sum+=l;
        }
        return sum;
    }

    public static void main(String[] args) {
        int []a = {1,12,-5,-6,50,3};
        new FindMaxAverage().findMaxAverage(a,4);
    }
}