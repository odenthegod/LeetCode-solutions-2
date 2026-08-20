class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int cnt1=0;
        int cnt2=0;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[cnt1++]=nums[0];
        arr2[cnt2++]=nums[1];
        for (int i=2;i<n;i++){
           if(arr1[cnt1-1]>arr2[cnt2-1]){
            arr1[cnt1++]=nums[i];
           }else{
            arr2[cnt2++]=nums[i];
           }
        }
        int[] result = new int[n];
        int index = 0;
        
        for (int i = 0; i < cnt1; i++) {
            result[index++] = arr1[i];
        }
        for (int i = 0; i < cnt2; i++) {
            result[index++] = arr2[i];
        }
        
        return result;

    }
}