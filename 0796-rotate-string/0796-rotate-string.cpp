class Solution {
public:
    bool rotateString(string s, string goal) {
        if (s.length()!=goal.length()){
            return false;
        }
        string doubled=s+s;
        for (int i=0;i<s.length();i++){
            string sub=doubled.substr(i,s.length());
            if(sub==goal){
                return true;
            }
        }
        return false;
    }
};