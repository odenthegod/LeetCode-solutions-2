class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=0;
        int num=x;
        while(x>0){
            n=n+x%10;
            x/=10;
        }
        if(num%n==0) return n;
        else return -1;

    }
}