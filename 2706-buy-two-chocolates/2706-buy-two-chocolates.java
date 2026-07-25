class Solution {
    public int buyChoco(int[] nums, int money) {
        int left=money;
        int n=money;
        Arrays.sort(nums);
        for (int i=0;i<2;i++){
            if(left>0&&left>=nums[i]){
                left-=nums[i];
            }
            else{
                left=n;
            }
        }
        return left;
    }
}