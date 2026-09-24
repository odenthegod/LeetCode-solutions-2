class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int total=0;
        int left=0;
        int n=nums.size();
        for(int x:nums){
            total+=x;
        }
        for(int i=0;i<n;i++){
            if(left==total-left-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
};