class Solution {
public:
    void reverseString(vector<char>& s) {
        int right=0;
        int left=s.size()-1;
        while(right<left){
            char temp=s[right];
            s[right]=s[left];
            s[left]=temp;
            right++;
            left--;
        }
    }   
};