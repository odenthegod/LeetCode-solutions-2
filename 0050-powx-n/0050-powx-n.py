class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        binary=n
        ans=1
        if(n<0):
            x=1/x
            binary=-binary
        while binary>0:
            if binary%2==1:
                ans*=x
            x*=x
            binary/=2
        return ans
        