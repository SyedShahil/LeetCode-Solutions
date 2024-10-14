class Maximal_Score_After_Applying_K_Operations{
    public long maxKelements(int[] nums, int k) {
 PriorityQueue<Integer> obj= new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            obj.add(nums[i]);
        }
        long ans=0;
        for(int i=0;i<k;i++){
            int val=obj.poll();
            ans+=val;
            int temp=(int)Math.ceil(val/3.0);
            obj.add(temp);
        }
        return ans;
    }
}
