class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int mul=1;

        for (int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
               
                int expected= k*mul;
                 if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                } 
                if (nums[i] < expected) {
                    continue;
                }
                if (nums[i] > expected) {
                    return expected;
                }
                mul++;

            }
        }
        return k*mul;
    }
}