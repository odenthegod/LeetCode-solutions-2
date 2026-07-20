class Solution {
public:
int product(int a){
        int p=1;
        while(a>0){
            p=p*(a%10);
            a/=10;
        }
        return p;
    }
    int smallestNumber(int n, int t) { 
        while(true){
            int ans=product(n);
            if (ans%t==0) return n;
            n++;
        }
    }
};