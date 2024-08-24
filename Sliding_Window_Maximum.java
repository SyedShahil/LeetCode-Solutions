class Sliding_Window_Maximum{
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        int n=nums.length;
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<n;i++){
                if(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                    dq.pollFirst();
                }
                while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
            if(i>=k-1){
                ans[i-k+1]=nums[dq.peekFirst()];
            }
        }
    return ans; 
    }
}
