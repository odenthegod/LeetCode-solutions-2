class Solution {
    public int[] plusOne(int[] nums) {
        for (int i=nums.length-1;i>-1;i--){
            if(nums[i]<9){
                nums[i]+=1;
                return nums;
            }
            nums[i]=0;
        }
        int[] newNums= new int[nums.length+1];
        newNums[0]=1;
        return newNums;
    }
}