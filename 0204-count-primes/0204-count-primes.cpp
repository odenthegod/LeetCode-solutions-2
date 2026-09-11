class Solution {
public:
    int countPrimes(int n) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        if(n<=2) return 0;
        bool* composite = new bool[n]();
        int cnt=0;
        for(int i=2;i*i<n;i++){
            if(!composite[i]){
                for(int j=i*i;j<n;j+=i){
                    composite[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(!composite[i]){
                cnt++;
            }
        }
        return cnt;

    }
};