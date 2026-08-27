class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size()==0||matrix[0].size()==0){
            return false;
        }
        int n=matrix.size();
        int m=matrix[0].size();
         
        int startr=0;
        int endr=n-1;
        while(startr<=endr){
            int midr=startr+(endr-startr)/2;
            if(target>=matrix[midr][0]&&target<=matrix[midr][m-1]){

                int starte=0;
                int ende=m-1;
                while(starte<=ende){
                    int mide=starte+(ende-starte)/2;
                    if(matrix[midr][mide]==target){
                        return true;
                    }
                    else if(target<matrix[midr][mide]){
                        ende=mide-1;
                    }else{
                        starte=mide+1;
                    }
                }
                return false;
            }
            else if(target<matrix[midr][0]){
                endr=midr-1;
            }else{
                startr=midr+1;
            }
        }
        return false;
    }
};