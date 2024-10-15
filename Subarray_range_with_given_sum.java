class Subarray_range_with_given_sum{
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        HashMap<Integer,Integer> obj=new HashMap<>();
        obj.put(0,1);
        int cnt=0;
        int psum=0;
        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            if(obj.containsKey(psum-tar)){
                cnt+=obj.get(psum-tar);
            }
                obj.put(psum,obj.getOrDefault(psum,0)+1);
            
        }
        return cnt;
    }
}
