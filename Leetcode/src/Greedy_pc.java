class Solution1221 {
    public int balancedStringSplit(String s) {
        int cnt=0,res=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L')  cnt++;

            if (s.charAt(i)=='R')  cnt--;

            if (cnt==0) res++;
        }
        return res;
    }
}

public class Greedy_pc {
}
