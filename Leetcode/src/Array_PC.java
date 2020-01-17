import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

//27. Remove Element
class Solution27 {
    public int removeElement() {
        int[] nums={3,2,2,3};
        int val=3;
        int res=0;
        int n=nums.length;
        for (int i = 0; i <n; i++) {
            if (nums[i]!=val) nums[res++]=nums[i];
        }
        return res;
    }
}

//26. Remove Duplicates from Sorted Array
class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return 1;
        int id=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=nums[id]){
               nums[++id]=nums[i];
            }
        }
        return ++id;
    }
}
//80
class Solution80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return 1;
        int ct=1;
        int id=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==nums[id]&&ct==1) {
                nums[++id] = nums[i];
            }
            if (nums[i]!=nums[id]){
                nums[++id]=nums[i];
                ct=1;
            }
        }
        return id;
    }
}
//189. Rotate Array
class Solution189 {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] res=reverse(nums,n);
        nums=reverse(nums,n);
        res=helper(nums,k);
        System.out.println(Arrays.toString(res));

    }

    private  int[] reverse(int[] nums, int n){
        int[] tmp=new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i]=nums[n-1-i];
        }
        return tmp;
    }

    private int[] helper(int[] nums,int k){
        int n=nums.length;
        int[] tmp=nums.clone();
        for (int i = 0; i < k; i++) {
            tmp[i]=nums[k-1-i];
        }
        for (int i = k; i < nums.length; i++) {
            tmp[i]=nums[--n];
        }
        return tmp;
    }
}

//41. First Missing Positive
class Solution41 {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> h=new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            h.add(nums[i]);
        }
        int res=1; int n=h.size();
        while(res<=n){
            if (!h.contains(res))  return res;
                res++;
        }
        return res;
    }
}

//299. Bulls and Cows
class Solution299 {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> s=new HashMap<>();
        HashMap<Character,Integer> g=new HashMap<>();
        int a=0;int b=0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i)==guess.charAt(i)) {a++;continue;}
            if (s.get(secret.charAt(i))!=null) {
                s.replace(secret.charAt(i),s.get(secret.charAt(i))+1);
                continue;
            }
            s.put(secret.charAt(i),1);

        }
        for (int i = 0; i < guess.length(); i++) {
            if (s.get(guess.charAt(i))==null) continue;
            if (secret.charAt(i)==guess.charAt(i)) continue;
            if (s.get(guess.charAt(i))>0){
                b++;
                s.replace(guess.charAt(i),s.get(guess.charAt(i))-1);
            }
        }
        return a+"A"+b+"B";
    }
}

//134. Gas Station
class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=-1,total=0,sum=0,index=0;
        for (int i = 0; i < gas.length; i++) {
            sum+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if (sum<0){
                sum=0;
                index=i+1;
            }
        }
        if (total<0){
            return -1;
        }
        return index;
    }
}

class Solution274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len=citations.length;
        for(int i=0;i<len;i++){
            if(citations[i]>=len-i) return len-i;
        }
        return 0;
    }

}

class Solution950 {
    public int[] deckRevealedIncreasing() {
        int[] deck={17,13,11,2,3,5,7};
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        for (int i = deck.length-1; i >=0; i--) {
            if (q.size() > 0)q.add(q.poll());
            q.add(deck[i]);
        }
        int[] res = new int[deck.length];
        for (int i = deck.length-1; i >=0; i--) {
           res[i]=q.poll();
        }
        return res;
    }
}



public class Array_PC {
    public static void main(String[] args) {

        Solution950 s=new Solution950();
        int[] arr={3,4,-1,1};
        System.out.println(Arrays.toString(s.deckRevealedIncreasing()));
    }
}
