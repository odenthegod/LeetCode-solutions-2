class Solution {
public:
    vector<int> transformArray(vector<int>& nums) {
        int n=nums.size();
        int even=0;
        for (int i=0;i<n;i++){
            if(nums[i]%2==0){
                even++;
            }
        }
        for(int i=0;i<even;i++){
            nums[i]=0;
        }
        for(int j=even;j<n;j++){
            nums[j]=1;
        }
        return nums;
    }
};