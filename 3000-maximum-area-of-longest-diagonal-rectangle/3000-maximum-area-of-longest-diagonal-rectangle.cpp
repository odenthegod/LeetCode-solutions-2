class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {
        int max1=0;
        int area=0;
        int maxarea=0;
        for(int i=0;i<dimensions.size();i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            
            int dia=l*l+w*w;
            area=l*w;
            if(dia>max1){
            max1=dia;
            maxarea=area;
            }
            else if(dia==max1) maxarea=max(area,maxarea);   
        }
        return maxarea;
    }
};