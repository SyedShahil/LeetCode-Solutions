class Binary_Subarrays_With_Sum{
    public int numSubarraysWithSum(int[] nums, int goal) {
    return find(goal,nums)-find(goal-1,nums);
    }
    public int find(int goal,int []nums){
        if(goal<0){
            return 0;
        }
           int i=0;
        int j=0;
        int sum=0;
        int cnt=0;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>goal){
                sum=sum-nums[i];
                i++;
            }
            if(sum<=goal){
            cnt=cnt+(j-i+1);
            }
            j++;
        }
        return cnt;
    }
}
