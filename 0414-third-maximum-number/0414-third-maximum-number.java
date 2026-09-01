class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n<3) return nums[n-1];
        int cnt=0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                cnt++;
            }else{
                continue;
            }
            if(cnt==2){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}