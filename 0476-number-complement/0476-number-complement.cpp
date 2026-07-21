class Solution {
public:
    int findComplement(int num) {
        int temp = num;
        int i = 1;
        while (temp > 0) {
            num ^= i;       
            i <<= 1;        
            temp >>= 1;     
        }
        
        return num;
    }
};