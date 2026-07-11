class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        if(x<0) return false;
        else{
            long n=0;
            while(x>0){
                n=n*10+x%10;
                x/=10;
            }
            return n==original;   
        }
    }
}