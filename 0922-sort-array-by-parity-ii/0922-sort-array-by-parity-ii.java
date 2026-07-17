class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int n = arr.length;
        int[] even = new int[n / 2];
        int[] odd = new int[n / 2];
        int evenIdx = 0;
        int oddIdx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evenIdx++] = arr[i];
            } else {
                odd[oddIdx++] = arr[i];
            }
        }
        evenIdx = 0;
        oddIdx = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = even[evenIdx++];
            } else {
                arr[i] = odd[oddIdx++];
            }
        }
        return arr;
    }
}