class Solution(object):
    def checkPerfectNumber(self, num):
        if num <= 1:
            return False
        
        # 1 is always a divisor, so we start our sum at 1
        total_sum = 1
        
        # Iterate up to the square root of num
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                total_sum += i
                # Avoid adding the square root twice (e.g., 6*6 = 36)
                if i * i != num:
                    total_sum += num // i
                    
        return total_sum == num
        