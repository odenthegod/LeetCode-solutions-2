class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicate=new ArrayList<>();
        for (int num:nums) {
            int index=Math.abs(num)-1;
            if (nums[index]< 0) {
                duplicate.add(Math.abs(num));
            } else {
                nums[index]=-nums[index];
            }
        }
        return duplicate;
    }
}