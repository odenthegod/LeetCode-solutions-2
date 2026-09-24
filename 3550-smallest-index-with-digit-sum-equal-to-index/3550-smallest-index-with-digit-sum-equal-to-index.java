class Solution {
    public int sumofdigit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for (int i=0;i<nums.length;i++){
            int digitsum=sumofdigit(nums[i]);
            if(digitsum==i) return i;
        }
        return -1;
    }
}