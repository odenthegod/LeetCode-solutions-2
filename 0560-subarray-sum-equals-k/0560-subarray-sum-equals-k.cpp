class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n=nums.size();
        int prefix[n];
        int cnt=0;
        prefix[0]=nums[0];
        for(int i=1;i<nums.size();i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        unordered_map<int,int>m;
        for(int j=0;j<nums.size();j++){
            if(prefix[j]==k){
                cnt++;
            }
            int val=prefix[j]-k;
            if(m.find(val)!=m.end()){
                cnt+=m[val];
            }
            if(m.find(prefix[j])==m.end()){
                m[prefix[j]]==0;    
            }
            m[prefix[j]]++;

        }
        return cnt;
    }
};