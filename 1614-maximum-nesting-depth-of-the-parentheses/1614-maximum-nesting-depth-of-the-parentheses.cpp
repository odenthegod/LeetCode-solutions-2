class Solution {
public:
    int maxDepth(string s) {
        int max_depth=0;
        int current=0;
        for(char ch:s){
            if(ch=='('){
                current++;
                max_depth=max(current,max_depth);
            }
            else if(ch==')'){
                current--;
            }
        }
        return max_depth;
    }
};