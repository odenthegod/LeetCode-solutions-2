class Solution {
public:
    int titleToNumber(string s) {
        int n=s.length();
        int result=0,power=0;
        for(int i=n-1;i>=0;i--){
            int val=s[i]-'A'+1;
            result+=val*pow(26,power);
            power++;
        }
        return result;
    }
};