class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum=new int[nums.length];
        int[] rightsum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0) leftsum[0]=0;
            else{
                leftsum[i]=nums[i-1]+leftsum[i-1];
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1) rightsum[i]=0;
            else{
                rightsum[i]=nums[i+1]+rightsum[i+1];
            }
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return nums;
    }
}