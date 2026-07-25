class Solution(object):
    def numberOfCuts(self, n):
        """
        :type n: int
        :rtype: int
        """
        if(n==1 or n==0):
             return 0
        elif(n%2!=0):
             return n
        else :
            return n/2
        