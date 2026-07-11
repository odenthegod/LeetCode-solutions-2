class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        if(x<0){
            return false;
        }else{
            long n=0;
            while(x>0){
                int r=x%10;
                n=n*10+r;
                x/=10;
            }
            if(n==original) return true;
            else{
                return false;
            }
        }
    }
}