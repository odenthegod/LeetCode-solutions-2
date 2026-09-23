class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int target=total-x;
        if(target<0) return -1;
        if(target==0) return nums.length;

        int current=0;
        int maxlength=-1;
        int left=0;
        for(int right=0;right<=nums.length-1;right++){
            current+=nums[right];
             while (current > target && left <= right) {
                current -= nums[left];
                left++;
            }
            if(current==target){
                int currentlength=right-left+1;
                if(currentlength>maxlength){
                    maxlength=currentlength;
                }
            }
        }
        if(maxlength==-1) return -1;
        else return nums.length-maxlength;
    }
}