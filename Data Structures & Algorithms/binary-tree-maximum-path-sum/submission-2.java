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
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0]=Integer.MIN_VALUE;
        helper(root,max);
        return max[0];
    }

    public int helper(TreeNode root,int[] res){
        if(root==null)return 0;

        int left = helper(root.left,res);
        int right = helper(root.right,res);

        int val=root.val;

        int a= val + left;  //left
        int b= val + right; //right
        int c=  val + left + right;//both
        int d=  val; //none
        
        val= Math.max(a ,Math.max(b ,d));
        res[0] = Math.max(res[0],Math.max(val,c));

        return val;
    }
}
