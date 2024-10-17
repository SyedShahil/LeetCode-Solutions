class  Maximum_Swap{
    public int maximumSwap(int num) {
        char arr[]=Integer.toString(num).toCharArray();
        int n=arr.length;
        char maxEle=arr[n-1];
        int maxidx=n-1;
        int swapidx1=-1;
        int swapidx2=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxEle){
                maxEle=arr[i];
                maxidx=i;
            }
            else if(arr[i]<maxEle){
                swapidx1=i;
                swapidx2=maxidx;
            }
        }
        if(swapidx1!=-1){
            char temp=arr[swapidx1];
            arr[swapidx1]=arr[swapidx2];
            arr[swapidx2]=temp;
        }
        return Integer.parseInt(new String(arr));
    }
}
