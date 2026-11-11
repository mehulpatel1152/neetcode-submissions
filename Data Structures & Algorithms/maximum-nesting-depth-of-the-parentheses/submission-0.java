class Solution {
    public int maxDepth(String s) {
        int open=0,max=0;

        for(char x:s.toCharArray()){
            if(x=='(')open++;
            else if(x==')')open--;

            max = Math.max(max,open);
        }

        return max;
    }
}