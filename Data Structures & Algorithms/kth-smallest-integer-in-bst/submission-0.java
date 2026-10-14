/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int kth[] = new int[1];
        helper(root,0,k,kth);
        return kth[0];
    }

    public int helper(TreeNode root,int idx,int k,int[] kth){
        if(root==null)return idx;

        idx = helper(root.left,idx,k,kth);
        idx++;
        if(k==idx)kth[0]=root.val;
        idx = helper(root.right,idx,k,kth);
        return idx;

    }
}
