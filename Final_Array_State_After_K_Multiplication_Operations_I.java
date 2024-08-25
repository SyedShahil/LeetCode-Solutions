class Final_Array_State_After_K_Multiplication_Operations_I{
    public int minval(int arr[]){
        int mini=Integer.MAX_VALUE;
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
                j=i;
            }
        }
        return j;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int ind=minval(nums);
            nums[ind]*=multiplier;
        }
        return nums;
    }
}
