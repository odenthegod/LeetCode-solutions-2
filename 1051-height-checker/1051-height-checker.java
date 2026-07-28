class Solution {
    public int heightChecker(int[] heights) {
        int[] height = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int cnt=0;
        for (int i=0;i<heights.length;i++){
            if(heights[i]!=height[i]){
                cnt++;
            }
        }
        return cnt;
    }
}