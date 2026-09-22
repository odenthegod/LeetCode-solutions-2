class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int small=0;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]>nums[j]){
                    small++;
                }
            }
            ans[i]=small;
        }
        return ans;
    }
}