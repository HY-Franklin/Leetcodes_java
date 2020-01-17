class Solution28 {
    public int strStr() {
        String haystack="mississippi"; String needle="issip";
        int index=-1;
        if (haystack.isEmpty()&&needle.isEmpty()) return 0;
        if (needle.isEmpty()) return 0;
        if (needle.length()>haystack.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j <needle.length() ; j++) {
                if (haystack.charAt(i+j)==needle.charAt(j)){
                    index=i;
                    if (j==needle.length()-1) return index;
                }
                System.out.println(i+j);
                if (haystack.charAt(i+j)!=needle.charAt(j)){
                    index=-1;
                    break;
                }
            }
        }
        return index;
    }
}



public class String_PC {
    public static void main(String[] args) {
        Solution28 s=new Solution28();
        System.out.println(s.strStr());
    }
}
