class Solution {
    public int add(int week){
        return (7*(2*week+6))/2;
    }
    public int totalMoney(int n) {
        int week=n/7;
        int days=n%7;
        int sum=0,cnt=1;
        for (int i=1;i<=week;i++){
            sum+=add(i);
            cnt++;
        }
        for (int i=0;i<days;i++){
            sum+=cnt;
            cnt++;
        }
        return sum;
    }
}