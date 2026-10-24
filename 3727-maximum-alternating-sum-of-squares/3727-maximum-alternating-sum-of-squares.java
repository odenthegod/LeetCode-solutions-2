class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[] sq= new long [n];
        for(int i=0;i<n;i++){
            sq[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(sq);

        int m = n / 2;
        long total=0;
        for (int i = 0; i < m; i++) {
            total -= sq[i];
        }
        for(int i=m;i<n;i++ ){
            total+=sq[i];

        }
        return total;
    }
}