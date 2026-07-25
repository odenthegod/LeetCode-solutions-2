class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int great = biggest_number(nums[i]);
            sum1 += great;
        }
        return sum1;
    }

    public int biggest_number(int n) {
        int big = 0, cnt = 0, sum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem > big)
                big = rem;
            n /= 10;
            cnt++;
        }
        for (int i = 0; i < cnt; i++) {
            sum = sum * 10 + big;
        }
        return sum;
    }
}
