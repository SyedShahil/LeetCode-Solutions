class Sort_an_Array{
    void merge(int []arr,int low,int mid,int high){
        ArrayList<Integer> obj=new ArrayList<>();
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                obj.add(arr[i]);
                i++;
            }
            else{
                obj.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            obj.add(arr[i]);
            i++;
        }
        while(j<=high){
            obj.add(arr[j]);
            j++;
        }
        for(int k=low;k<=high;k++){
            arr[k]=obj.get(k-low);
        }
    }
    void mergesort(int []arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}
