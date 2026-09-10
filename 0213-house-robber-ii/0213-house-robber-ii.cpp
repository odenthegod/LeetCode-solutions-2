class Solution {
public:
    int robb(const vector<int>& nums, int start,int end){
        int current=0;
        int prev=0;
        for(int i=start;i<=end;i++){
            int newmax=max(current,prev+nums[i]);
            prev=current;
            current=newmax;
        }
        return current;
    }
    int rob(vector<int>& nums) {
        
        if(nums.size()==1){
            return nums[0];
        }
        int rob1=robb(nums,0,nums.size()-2);
        int rob2=robb(nums,1,nums.size()-1);
        return max(rob1,rob2);
    }
};