class House_Robber_II{
    public int first(int dp[],int nums[],int n){
        if(n==0)return nums[0];
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int take=nums[n]+first(dp,nums,n-2);
        int nottake=0+first(dp,nums,n-1);
        return dp[n]=Math.max(take,nottake);
    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int temp1[]=new int[nums.length-1];
        for(int i=0;i<temp1.length;i++){
            temp1[i]=nums[i];
        }
        int temp2[]=new int[nums.length-1];
        for(int j=1;j<nums.length;j++){
            temp2[j-1]=nums[j];
        }
        int dp1[]=new int[temp1.length];
        Arrays.fill(dp1,-1);
       int n1=first(dp1,temp1,temp1.length-1);
        int dp2[]=new int[temp2.length];
        Arrays.fill(dp2,-1);
        int n2=first(dp2,temp2,temp2.length-1);
        return Math.max(n1,n2);
        
    }
}
