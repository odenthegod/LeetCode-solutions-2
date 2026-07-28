class Solution {
    public int minimumIndex(int[] capacity, int itemsize) {
        int idx=Integer.MAX_VALUE;
        int diff=Integer.MAX_VALUE;//max number
        for (int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemsize){
                int diff1=capacity[i]-itemsize;
                if(diff1<diff){
                    diff=diff1;
                    idx=i;
                }
            }
        }
        if(idx==Integer.MAX_VALUE){
            return -1;
        }else{
            return idx;
        }
    }
}