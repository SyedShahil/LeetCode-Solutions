class Find_if_Digit_Game_Can_Be_Won{
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0 && nums[i]<=9){
                sum1+=nums[i];
            }
            else{
                sum2+=nums[i];
            }
        }
        if(sum1!=sum2){
            return true;
        }
        return false;
    }
}
