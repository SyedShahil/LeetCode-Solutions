class Longest_Subarray_With_Maximum_Bitwise_AND{
    public int longestSubarray(int[] nums) {
     int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
            }
        }
    int cs=0;
    int ans=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==m){
            cs++;
        }
        else{
            cs=0;
        }
        ans=Math.max(cs,ans);
    }
        return ans;
    }
}
