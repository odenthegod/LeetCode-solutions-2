class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        int n=spells.size();
        int m=potions.size();
        vector <int>ans(n);
        sort(potions.begin(),potions.end());

        for(int i=0;i<n;i++){
            int left=0;
            int right=m-1;
            int firstidx=m;

            while(left<=right){
                int mid=left+(right-left)/2;
                if((long long)spells[i]*potions[mid]>=success){
                    firstidx=mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i]=m-firstidx;
        }
        return ans;
    }
};