class Count_Number_of_Maximum_Bitwise_OR_Subsets{
    public int countMaxOrSubsets(int[] nums) {
        int target=0;
        for(int i=0;i<nums.length;i++){
            target |= nums[i];
        }
        Integer dp[][]=new Integer[nums.length][target+1];
        return find(target,0,nums,0,dp);
    }
    public int find(int target,int curtar,int nums[],int idx,Integer dp[][]){
        if(nums.length==idx){
            return(curtar==target)?1:0;
        }
        if(dp[idx][curtar]!=null)return dp[idx][curtar];
        int take=find(target,curtar|nums[idx],nums,idx+1,dp);
        int nottake=find(target,curtar,nums,idx+1,dp);
        return dp[idx][curtar]=take+nottake;
    }
}
