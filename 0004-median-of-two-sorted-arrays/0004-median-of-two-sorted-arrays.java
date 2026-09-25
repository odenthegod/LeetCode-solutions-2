class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int newlength=m+n;

        double median=0;
        int[] ans=new int [newlength];
        int idx=0;
        for(int i=0;i<m;i++){
            ans[idx]=nums1[i];
            idx++;
        }
        for(int i=0;i<n;i++){
            ans[idx]=nums2[i];
            idx++;
        }
        Arrays.sort(ans);
        if(newlength%2==0){
            //even
            int mid1=(int)newlength/2;
            int mid2=mid1-1;
            median=(ans[mid2]+ans[mid1])/2.0;
            return median;
        }
        int mid=(int)newlength/2;
        return ans[mid];
    }
}