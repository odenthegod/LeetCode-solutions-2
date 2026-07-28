class Solution {
public:
    int maxProduct(int n) {
        int big=0,second_big=0;
        while(n>0){
            int rem=n%10;
            if(rem>big){
                second_big=big;
                big=rem;
            }else if(rem<=big && rem>second_big){
                second_big=rem;
            
            }
            n/=10;
        }
        return big*second_big;
    }
};