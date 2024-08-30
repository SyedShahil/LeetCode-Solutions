class Jump_Game{
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int n=nums.length-1;
        int far=0;
     for(int i=0;i<nums.length;i++){
         if(i>far){return false;}
         far=Math.max(far,i+nums[i]);
         if(far>=n){
             return true;
         }
     }
        return false;
    }
}
