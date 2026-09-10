class Solution {
    public int robb(int[]nums,int s,int e){
        int prev=0;
        int curr=0;
        for(int i=s;i<=e;i++){
            int newcurr=Math.max(curr,prev+nums[i]);
            prev=curr;
            curr=newcurr;
        }
        return curr;
    }
    public int rob(int[] nums) {
  
        if(nums.length==1){
            return nums[0];
        }
        int rob1=robb(nums,0,nums.length-2);
        int rob2=robb(nums,1,nums.length-1);
        return Math.max(rob1,rob2);
    }
}