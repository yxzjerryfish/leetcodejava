package leetcode;

/**
 * @author Fish
 */
public class LongestPalindrome {
    public static   String longestPalindrome(String s) {
        String max = new String();
        if(isPalindrome(s.toCharArray())){
            return s;
        }
        if(s.length()==0){
            return "";
        }
        for (int i = 0;i<s.length() - 1;i++){
            for (int j = s.length();j>i;j--){
                char[] o = s.substring(i,j).toCharArray();
                if (isPalindrome(o)){
                    if(max.length() == 0 || String.valueOf(o).length() > max.length()){
                        max = String.valueOf(o);
                    }
                }
            }
        }
        return max.length() == 0?s.substring(0,1):max;
    }

    public static boolean isPalindrome(char[] c){
        if(c.length == 1){
            return false;
        }
        for (int i =0,j=c.length-1;i<=j;i++,j--){
            if (c[i] != c[j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String n = "rgczcpratwyqxaszbuwwcadruayhasynuxnakpmsyhxzlnxmdtsqqlmwnbxvmgvllafrpmlfuqpbhjddmhmbcgmlyeypkfpreddyencsdmgxysctpubvgeedhurvizgqxclhpfrvxggrowaynrtuwvvvwnqlowdihtrdzjffrgoeqivnprdnpvfjuhycpfydjcpfcnkpyujljiesmuxhtizzvwhvpqylvcirwqsmpptyhcqybstsfgjadicwzycswwmpluvzqdvnhkcofptqrzgjqtbvbdxylrylinspncrkxclykccbwridpqckstxdjawvziucrswpsfmisqiozworibeycuarcidbljslwbalcemgymnsxfziattdylrulwrybzztoxhevsdnvvljfzzrgcmagshucoalfiuapgzpqgjjgqsmcvtdsvehewrvtkeqwgmatqdpwlayjcxcavjmgpdyklrjcqvxjqbjucfubgmgpkfdxznkhcejscymuildfnuxwmuklntnyycdcscioimenaeohgpbcpogyifcsatfxeslstkjclauqmywacizyapxlgtcchlxkvygzeucwalhvhbwkvbceqajstxzzppcxoanhyfkgwaelsfdeeviqogjpresnoacegfeejyychabkhszcokdxpaqrprwfdahjqkfptwpeykgumyemgkccynxuvbdpjlrbgqtcqulxodurugofuwzudnhgxdrbbxtrvdnlodyhsifvyspejenpdckevzqrexplpcqtwtxlimfrsjumiygqeemhihcxyngsemcolrnlyhqlbqbcestadoxtrdvcgucntjnfavylip";
        System.out.println(longestPalindrome(n));

    }
}
