class Solution {
    public int accountBalanceAfterPurchase(int mny) {
        if(mny%10==0) return 100-mny;
        int diff=100-mny;
        int num1=diff/10;
        int num2=(num1+1)*10;
        num1=num1*10;
        if((Math.abs(diff-num1))==(Math.abs(diff-num2))){
            return num1;
        }
        if((Math.abs(diff-num1))<(Math.abs(diff-num2))){
            return num1;
        }else {
            return num2;
        }
    }
}