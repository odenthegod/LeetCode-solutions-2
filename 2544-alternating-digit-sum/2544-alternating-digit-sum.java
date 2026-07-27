class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        String str=Integer.toString(n);
        for (int i=0;i<str.length();i++){
            if (i%2==0){
                sum+=Character.getNumericValue(str.charAt(i));
            }else{
                sum-=Character.getNumericValue(str.charAt(i));
            }
        } 
        return sum;
    }
}