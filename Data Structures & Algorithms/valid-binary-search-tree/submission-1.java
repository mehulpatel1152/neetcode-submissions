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
    public boolean isValidBST(TreeNode root) {
        if(root==null)return false;

        ArrayList<Integer> temp = new ArrayList<>();

        helper(root,temp);

        for(int i=0;i<temp.size()-1;i++)if(temp.get(i)>=temp.get(i+1))return false;


        return true;
        
    }

    public void helper(TreeNode root,ArrayList<Integer> val){
        if(root==null)return ;

        helper(root.left,val);
        val.add(root.val);
        helper(root.right,val);
    }
}
