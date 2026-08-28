class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> unique=new HashSet<>();

        for (int i:nums){
            unique.add(i);
        }
        List<Integer>missing=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!unique.contains(i)){
                missing.add(i);
            }
        }
        return missing;
    }
}