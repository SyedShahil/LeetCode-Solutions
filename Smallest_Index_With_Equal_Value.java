class Smallest_Index_With_Equal_Value{
    public int smallestEqual(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                return i;
            }
        }
        return ans;
    }
}
