class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int max=0;
        for (int i=0;i<s.length();i++){
            //pushing character into the stack 
            char ch=s.charAt(i);
            if (ch=='('){
                stack.push(i);
            }
            else {
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                int current=i-stack.peek();
                max=Math.max(max,current);
            }
        }
        return max;
    }
}