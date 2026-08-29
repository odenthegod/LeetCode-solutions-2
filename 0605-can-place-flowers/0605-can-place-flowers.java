class Solution {
    public boolean canPlaceFlowers(int[] flower, int n) {
        
        if(n<=0){
            return true;
        }
        for(int i=0;i<flower.length;i++){
            if(flower[i]==0){
                boolean isLeft =(i==0 ||flower[i-1]==0);
                boolean isRight =(i==flower.length-1 ||flower[i+1]==0);

                if(isLeft&& isRight){
                    flower[i]=1;
                    n--;
                
                if(n==0){
                    return true;
                }
                }
            }

        }
        return n<=0;
    }
}