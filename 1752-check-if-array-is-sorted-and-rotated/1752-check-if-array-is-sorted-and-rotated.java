class Solution {
    public boolean check(int[] nums) {
        int cnt=0;
        for(int i=0;i<=nums.length-2;i++){

            if(nums[i]<=nums[i+1] ){
                continue;
            }else{
                cnt++;
            }
            
        }
        if(cnt==0) return true;
        if(cnt==1 && nums[nums.length-1]<=nums[0]){
            return true;
        }

        return false;
    }
}