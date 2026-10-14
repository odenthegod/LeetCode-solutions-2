class Solution {
public:
    string maxSumOfSquares(int num, int sum) {
        if(sum >9*num) return "";
        int n=sum/9;
        int r=sum%9;
        string result="";
        result+=string(n,'9');
        if(r>0){
            result+=to_string(r);
        }
        int length=result.length();
        if(length<num){
            result+=string(num-length,'0');
        }
        return result;
    }
};