class Solution {
    
    public int titleToNumber(String s) {
        int n=s.length();
        int result=0,pow=0;
        for(int i=n-1;i>=0;i--){
            int val=s.charAt(i)-'A'+1;
            result+=val*Math.pow(26,pow);
            pow++;
        }
        return result;
    }
}