class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        
        int min_val=nums[0];
        int max_val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max_val){
                max_val=nums[i];
            }if(nums[i]<min_val){
                min_val=nums[i];
            }
        }
        int bucket_size=Math.max(1,(max_val-min_val)/nums.length-1);
        int bucket_cnt=((max_val-min_val)/bucket_size)+1;
        int[] bucket_mins = new int[bucket_cnt];
        int[] bucket_maxs = new int[bucket_cnt];
        java.util.Arrays.fill(bucket_mins, Integer.MAX_VALUE);
        java.util.Arrays.fill(bucket_maxs, Integer.MIN_VALUE);

        // 2. Map elements into their respective buckets
        for (int i = 0; i < nums.length; i++) {
            int idx = (nums[i] - min_val) / bucket_size;
            if (nums[i] < bucket_mins[idx]) {
                bucket_mins[idx] = nums[i];
            }
            if (nums[i] > bucket_maxs[idx]) {
                bucket_maxs[idx] = nums[i];
            }
        }

        // 3. Scan buckets sequentially to compute the max gap
        int max_gap = 0;
        int previous_max = min_val;

        for (int i = 0; i < bucket_cnt; i++) {
            // Skip empty buckets
            if (bucket_mins[i] == Integer.MAX_VALUE) {
                continue;
            }

            // Current bucket's minimum minus the previous bucket's maximum
            if (bucket_mins[i] - previous_max > max_gap) {
                max_gap = bucket_mins[i] - previous_max;
            }
            previous_max = bucket_maxs[i];
        }

        return max_gap;
    }
}