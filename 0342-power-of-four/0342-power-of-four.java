class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        int shift=0;
        while(n>1){
            if((n&1)!=0) return false;
            n=n>>1;
            shift++;
        }
        if(shift%2==0) return true;
        return false;
    }
}