import java.util.Arrays;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int idx1 = 0;
        int idx2 = 0;
        int i = 0; 
        int j = 0; 
        while (i < nums1.length) {
            while (j < nums2.length && nums2[j] < nums1[i]) {
                j++;
            }
            if (j < nums2.length && nums2[j] == nums1[i]) {
                idx1++;
            }
            i++; 
        }
        i = 0; 
        j = 0; 
        while (i < nums2.length) {
            while (j < nums1.length && nums1[j] < nums2[i]) {
                j++;
            }
            if (j < nums1.length && nums1[j] == nums2[i]) {
                idx2++;
            }
            i++; 
        }
        return new int[]{idx1, idx2};
    }
}
