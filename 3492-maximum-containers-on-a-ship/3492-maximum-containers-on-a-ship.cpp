class Solution {
public:
    int maxContainers(int n, int w, int maxWeight) {
        int space=n*n;
        int cnt=0;
        int total=0;
        for (int i=0;i<space;i++){
            if(total<maxWeight){
                total+=w;
                if(total>maxWeight){
                    break;
                }
                cnt++;
            }
        }
        return cnt;
    }
};