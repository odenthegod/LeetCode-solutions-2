class Solution {
public:
    int bs(vector<int>& nums ,int target,int start,int end){
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if(nums[mid]==target) return mid;
        if(nums[mid]<target){
            return bs(nums ,target,mid+1,end);
        }else if(nums[mid]>target){
            return bs(nums ,target,start,mid-1);
        }
        return -1;
    }
    int search(vector<int>& nums, int target) {
        int start=0;
        int end=nums.size()-1;
        return bs(nums,target,start,end);
    }
};