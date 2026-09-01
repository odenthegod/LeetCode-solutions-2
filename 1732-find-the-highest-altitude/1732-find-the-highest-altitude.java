class Solution {
    public int largestAltitude(int[] nums) {
        int n=nums.length;
        int [] num=new int[n+1];
        num[0]=0;
        for(int i=1;i<num.length;i++){
            num[i]=nums[i-1]+num[i-1];
        }
        int highest=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>highest){
                highest=num[i];
            }
        }
        return highest;
    }
}