class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='{' || x=='(' || x=='[')stk.push(x);
            else if(!stk.empty()){
                if(x=='}' && stk.peek()=='{')stk.pop();
                else if(x==']' && stk.peek()=='[')stk.pop();
                else if(x==')' && stk.peek()=='(')stk.pop();
                else return false;
            }else return false;
        }

        return stk.empty();
    }
}
