class Next_Greater_Element{
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                st.pop();
            }
            if(i<nums.length){
                ans[i]=(st.isEmpty())?-1:st.peek();
            }
            st.push(nums[i%nums.length]);
        }
        return ans;
    }
}
