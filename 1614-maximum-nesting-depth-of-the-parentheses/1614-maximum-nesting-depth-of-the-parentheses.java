class Solution {
    public int maxDepth(String s) {
        int max_depth=0;
        int current=0;

        for(char c:s.toCharArray()){
            if(c=='('){
                current+=1;
                max_depth=Math.max(max_depth,current);
            }
            else if(c==')'){
                current-=1;
            }
        }
        return max_depth;
    }
}