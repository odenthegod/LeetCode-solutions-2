class Solution {
    public int dominantIndex(int[] nums) {
        int largest = nums[0];
        int second_largest = -1; 
        int n = nums.length;
        int ans = 0; 
        
        for (int i = 1; i < n; i++) { 
            if (nums[i] > largest) {
                second_largest = largest;
                largest = nums[i];
                ans = i;
            }
            else if (nums[i] > second_largest) {
                second_largest = nums[i];
            }
        }
        
        if (largest >= 2 * second_largest) {
            return ans;
        }
        
        return -1;
    }
}
