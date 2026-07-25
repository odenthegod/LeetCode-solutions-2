class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max=0;
        int area=0;
        int maxarea=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            
            int dia=l*l+w*w;
            area=l*w;
            if(dia>max){
            max=dia;
            maxarea=area;
            }
            else if(dia==max) maxarea=Math.max(area,maxarea);   
        }
        return maxarea;
    }
}