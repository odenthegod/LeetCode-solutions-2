class Solution {
    public int pivotIndex(int[] nums) {

        int n=nums.length;
        if(n==0) return -1;
        int[] sumLeft= new int[n];
        sumLeft[0]=nums[0];
        int[] sumRight= new int[n];
        sumRight[n-1]=nums[n-1];
        for (int i=1;i<n;i++){
            sumLeft[i]=sumLeft[i-1]+nums[i];
        }
        for (int i=n-2;i>=0;--i){
            sumRight[i]=sumRight[i+1]+nums[i];
        }
        for (int i=0;i<n;i++){
            int left=(i==0)?0:sumLeft[i-1];
            int right=(i==n-1)?0:sumRight[i+1];
            if(right==left) return i;
        }
        return -1;
    }
}