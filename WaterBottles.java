class WaterBottles{
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        ans=ans+numBottles;
        ans=ans+(numBottles/numExchange);
        int empty=(numBottles%numExchange)+(numBottles/numExchange);
        while(empty>=numExchange){
            ans=ans+(empty/numExchange);
            empty=(empty%numExchange)+(empty/numExchange);
         
        }
        return ans;
        
    }
}
