class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit=0;
        int min=prices[0];
        int n=prices.size();
        for (int i=1;i<n;i++){
            if(prices[i]<min) min=prices[i];
            else if(prices[i]-min>profit) profit=prices[i]-min;
        }
        return profit;
    }
};