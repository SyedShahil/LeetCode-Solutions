class Next_Greater_Element1{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
        int ans[]=new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    ans[i]=nums2[k];
                    break;
                }
            }
        }
        return ans;
    }
}
