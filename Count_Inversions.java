class Count_Inversions{
    static long cnt=0;
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        cnt=0;
        mergesort(arr,0,n-1);
        return cnt;
    }
    static void mergesort(long []arr,int low,int high){
        if(low>=high){
            return ;
        }
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(long arr[],int low,int mid,int high){
        ArrayList<Long> obj=new ArrayList<>();
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                obj.add(arr[i]);
                i++;
            }
            else{
                obj.add(arr[j]);
                cnt+=(mid-i+1);
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
}
