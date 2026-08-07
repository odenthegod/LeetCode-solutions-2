class Solution {
    public int rob(int[] nums) {
        int robbed=0,skipped=0;
        for(int money:nums){
            int old=robbed;
            robbed=money+skipped;
            skipped=Math.max(old,skipped);
        }
        return Math.max(robbed,skipped);
    }
}