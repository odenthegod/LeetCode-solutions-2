class Solution {
public:
    int minimumIndex(vector<int>& capacity, int itemsize) {
        int idx=INT_MAX;;
        int diff=INT_MAX;//max number
        for (int i=0;i<capacity.size();i++){
            if(capacity[i]>=itemsize){
                int diff1=capacity[i]-itemsize;
                if(diff1<diff){
                    diff=diff1;
                    idx=i;
                }
            }
        }
        return (idx==INT_MAX)?-1:idx;
    }
};