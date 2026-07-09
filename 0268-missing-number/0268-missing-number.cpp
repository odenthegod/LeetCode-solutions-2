class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=0;
        for (int i=0;i<nums.size()+1;i++){
            n^=i;
        }
        for (int i:nums){
            n^=i;
        }
        return n;
    }
};