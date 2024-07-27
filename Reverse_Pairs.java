class Reverse_Pairs{
    public int reversePairs(int[] nums) {
       return mergesort(nums,0,nums.length-1);
        
    }
    int mergesort(int arr[],int low,int high){
        if(low>=high){
            return 0;
        }
        int mid=(low+high)/2;
       int cnt=mergesort(arr,low,mid);
        cnt+=mergesort(arr,mid+1,high);
        cnt+=count(arr,low,mid,high);
        merge(arr,low,mid,high);
        return cnt;
    }
    void merge(int arr[],int low,int mid,int high){
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
    int count(int arr[],int low,int mid,int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2L *arr[right]){
                right++;
            }
              cnt+=(right-(mid+1));
        }
        return cnt;
    }
}
