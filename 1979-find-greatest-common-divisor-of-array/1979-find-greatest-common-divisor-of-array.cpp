class Solution {
public:
    
    int findGCD(vector<int>& nums) {
        int min1=nums[0];
        int max1=nums[0];
        for (int i=1;i<nums.size();i++){
            min1=min(min1,nums[i]);
            max1=max(max1,nums[i]);
        }
        return gcd(min1, max1);
    }
};