class Solution {
    public int[] shuffle(int[] nums, int m) {
        int n=nums.length;
        int[] arr1=new int[n/2];
        int j=0;
        for(int i=n/2;i<n;i++){
            arr1[j++]=nums[i];
        }
        int[] arr2=new int[n];
        int k=0;
        for(int i=0;i<n;i+=2){
            arr2[i]=nums[k];
            arr2[i+1]=arr1[k];
            k++;
        }
        return arr2;
    }
}