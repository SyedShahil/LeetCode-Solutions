class House_Robber{
    public int find(int ind,int dp[],int nums[]){
        if(ind==0)return nums[ind];
        if(ind<0)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int pick=nums[ind]+find(ind-2,dp,nums);
        int notpick=0+find(ind-1,dp,nums);
        dp[ind]= Math.max(pick,notpick);
        return Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
     int n=nums.length;
    int dp[]=new int[n];
    Arrays.fill(dp,-1);
    return find(n-1,dp,nums);
    }
}
