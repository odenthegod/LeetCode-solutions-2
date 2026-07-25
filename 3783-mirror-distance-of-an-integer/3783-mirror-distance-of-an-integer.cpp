class Solution {
public:
    int reverese(int n){
        int sum=0;
        while(n>0){
            sum=sum*10+n%10;
            n/=10;
        }
        return sum;
    }
    int mirrorDistance(int n) {
        int rev=reverese(n);
        return abs(n-rev);
    }
};