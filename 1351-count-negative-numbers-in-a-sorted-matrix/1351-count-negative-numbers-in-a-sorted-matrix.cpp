class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int i=grid.size()-1,cnt=0;
        int j=0;
        while(i>=0 && j<grid[0].size()){
            if(grid[i][j]<0){
                cnt+=(grid[0].size()-j);
                i--;
            }else{
                j++;
            }
        }
        return cnt;
    }
};