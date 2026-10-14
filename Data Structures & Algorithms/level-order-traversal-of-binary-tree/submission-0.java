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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(Arrays.asList(root.val)));
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> val = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null){
                    val.add(temp.left.val);
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    val.add(temp.right.val);
                    q.add(temp.right);
                }
            }
            if(val.size()>0)res.add(val);

        }

        return res;

    }
}
