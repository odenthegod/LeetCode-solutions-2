class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxWater=0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){
            int width=rp-lp;
            int h=min(height[lp],height[rp]);
            int vol=width*h;
            maxWater=max(maxWater,vol);
            height[lp]<height[rp]?lp++:rp--;
        }
        return maxWater;
    }
    
};