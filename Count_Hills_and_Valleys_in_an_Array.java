class Count_Hills_and_Valleys_in_an_Array{
    public int countHillValley(int[] nums) {
     int ans=0;
        int n=nums.length;
        
        int prev=nums[0];
        for(int i=1;i<n-1;i++){
            if(nums[i]==nums[i+1]){
            continue;
            }
            if((prev<nums[i] && nums[i]>nums[i+1]) || (nums[i]<prev && nums[i]<nums[i+1])){
                ans++;
            }
        prev=nums[i];
        }
    
        return ans;
    }
}
