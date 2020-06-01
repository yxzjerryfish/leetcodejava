package newleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author Fish
 */
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] copyCandies = candies.clone();
        Arrays.sort(candies);
        int max = candies[candies.length-1];
        List<Boolean> kidsList = new ArrayList<>();
        for (int k:copyCandies){
            kidsList.add(k + extraCandies >= max);
        }
        return kidsList;
    }

    public List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandies = 0;
        for (int i = 0; i < n; ++i) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> ret = new ArrayList<Boolean>();
        for (int i = 0; i < n; ++i) {
            ret.add(candies[i] + extraCandies >= maxCandies);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] m = {4,2,1,1,2};
        System.out.println(new KidsWithCandies().kidsWithCandies(m,1));
    }
}
