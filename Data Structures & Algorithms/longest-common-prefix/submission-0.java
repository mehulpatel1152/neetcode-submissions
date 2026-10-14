class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        TreeNode root = new TreeNode('#');

        for(String s:strs){
            insert(root,s,0);
        }

        StringBuilder ans = new StringBuilder();
        TreeNode curr = root;

        while (curr.lst.size() == 1) {

            TreeNode next = curr.lst.get(0);

            // all strings must share this character
            if (next.freq != strs.length) break;

            ans.append(next.data);
            curr = next;
        }

        return ans.toString();

    }
    public void insert(TreeNode root,String str,int idx){
        if(root==null || idx>=str.length() )return;

        TreeNode node=null;
        char data = str.charAt(idx);
        for(TreeNode temp:root.lst){
            if(temp.data==data){
                node = temp;
                temp.freq++;
                break;
            }
        }

        if (node == null) {
            node = new TreeNode(data);
            root.lst.add(node);
        }

        insert(node, str, idx + 1);
        
    }

    class TreeNode{
        char data;
        int freq;
        ArrayList<TreeNode> lst = new ArrayList<>();

        public TreeNode(char data){
            this.data = data;
            this.freq=1;
            lst = new ArrayList<>();
        }
    }
}