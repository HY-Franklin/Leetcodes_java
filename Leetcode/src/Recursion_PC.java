import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
//938. Range Sum of BST
class Solution938 {
    int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        dfs(root,L,R);
        return sum;
    }
    void dfs(TreeNode root, int L, int R){
        if (root==null) return;

        if (root.val>=L&&root.val<=R)
        {
            sum += root.val;
            System.out.println();
            dfs(root.left, L, R);
            dfs(root.right, L, R);
        }
        if (root.val<L)
        {
            dfs(root.right, L, R);
        }
        if (root.val >R)
        {
            dfs(root.left, L, R);
        }
    }
}

//1137. N-th Tribonacci Number
class Solution1137 {
    public int tribonacci(int n) {
        int t0 = 0; int t1 = 1; int t2 = 1;
        if (n == 0) return 0;
        if (n<3) return 1;
        int res=0;
        for (int i=3; i <= n; i++)
        {
            res = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = res;
        }
        return res;
    }
}

//783. Minimum Distance Between BST Nodes
class Solution783 {
    ArrayList<Integer> inorder=new ArrayList<>();
    int minDiffInBST(TreeNode root) {
        int minValue = Integer.MAX_VALUE;
        dfs(root);
        for (int i = 1; i < inorder.size(); i++)
        {
            minValue = Math.min(Math.abs(inorder.get(i) - inorder.get(i - 1)),minValue);
        }
        return minValue;
    }

    void dfs(TreeNode root) {
        if (root==null) return;
        dfs(root.left);
        inorder.add(root.val);
        dfs(root.right);
    }
}

//784. Letter Case Permutation
//class Solution784 {
//
//    public List<String> letterCasePermutation(String S) {
//
//    }
//}

public class Recursion_PC {
}
