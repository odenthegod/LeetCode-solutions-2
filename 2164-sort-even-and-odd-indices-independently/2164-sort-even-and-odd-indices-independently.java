class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        Integer[] even= new Integer[(n + 1) / 2]; 
        Integer[] odd=new Integer[n/2]; 
        int idx=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[idx]=nums[i];
            }else{
                odd[idx]=nums[i];
                idx++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd, Collections.reverseOrder());
        int idx1=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=even[idx1];
            }else{
                nums[i]=odd[idx1++];
            }
        }
        return nums;
    }
}