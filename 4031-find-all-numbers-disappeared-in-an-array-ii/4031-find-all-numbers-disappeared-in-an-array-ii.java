class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int start = lower;

        int idx = 0;
        while (idx<nums.length && nums[idx]<lower) {
            idx++;
        }
        for (int i = lower; i <= upper; i++) {
            boolean ispresent = (idx < nums.length && nums[idx] == i);
            if (ispresent) {
                if (start < i) {
                    List<Integer> range = new ArrayList<>();
                    range.add(start);
                    range.add(i - 1);
                    result.add(range);
                }
                start = i + 1;
                while (idx < nums.length && nums[idx] == i) {
                    idx++;
                }
            }
        }
        if (start <= upper) {
            List<Integer> range = new ArrayList<>();
            range.add(start);
            range.add(upper);
            result.add(range);
        }
        return result;
    }
}