class Solution {
    public int minMoves(int[] nums) {
        int largest=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            int diff=largest-nums[i];
            cnt+=diff;
        }
        return cnt;
    }
}