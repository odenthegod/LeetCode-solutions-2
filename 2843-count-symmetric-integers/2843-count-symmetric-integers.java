class Solution {
    public boolean symmetric(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        if (n % 2 != 0) return false;
        
        int right = n - 1;
        int left = 0;
        int sum = 0;
        
        while (right > left) {
            sum += (s.charAt(right) - '0');
            sum -= (s.charAt(left) - '0');
            right--;
            left++;
        }
        return sum == 0;
    }
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for (int i=low;i<=high;i++){
            if(symmetric(i)){
                cnt++;
            }
        }
        return cnt;
    }
}