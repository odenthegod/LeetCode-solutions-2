class Solution {
public:
    int reverse(int x) {
        long num=0;
        while(x!=0){
            num=num*10+x%10;
            x/=10;
        }
        if(num<INT_MIN || num>INT_MAX-1){
            return 0;
        }
        return (int)num;
    }
};