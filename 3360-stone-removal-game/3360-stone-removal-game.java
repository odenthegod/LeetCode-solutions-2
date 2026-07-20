class Solution {
    public boolean canAliceWin(int n) {
        int turn =1;
        
        for (int i=10;i>0;i--){
            if (n-i>=0){
                n=n-i;
                turn++;
            }else{
                break;
            }
        }
        if(turn%2==0) return true;
        else return false;
    }
}