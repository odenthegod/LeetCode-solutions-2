class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] num=new int[2*n];
        int m=num.length;
        for (int i=0;i<n;i++){
            num[i]=nums[i];
            num[m-1-i]=nums[i];
        }
        return num;
    }
}