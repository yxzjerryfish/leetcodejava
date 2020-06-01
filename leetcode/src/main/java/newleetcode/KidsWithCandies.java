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

    public static void main(String[] args) {
        int[] m = {4,2,1,1,2};
        System.out.println(new KidsWithCandies().kidsWithCandies(m,1));
    }
}
