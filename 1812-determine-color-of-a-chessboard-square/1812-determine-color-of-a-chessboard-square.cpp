class Solution {
public:
    bool squareIsWhite(string coordinates) {
        int col=coordinates[0];
        int row=coordinates[1];
        int sum=row+col;
        if(sum%2==0) return false;
        else return true;
    }
};