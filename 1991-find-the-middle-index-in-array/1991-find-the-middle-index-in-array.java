class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=nums[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+nums[i];
        }

        for(int i=0;i<n;i++){
            int leftsum=(i==0)?0:ans[i-1];
            int rightsum=(i==n-1)?0:ans[n-1]-ans[i];
            if(leftsum==rightsum) return i;
        }
        return -1;

    }
}