int maxArea(int* height, int heightSize) {
    int max=0;
    int left=0;
    int right=heightSize-1;
    while(left<right){
        int width=right-left;
        int h=(height[left]<height[right])?height[left]:height[right];
        int vol=width*h;
        if (vol>max){
            max=vol;
        }
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
    }
    return max;
}