class Count_Smaller_Elements{
    int binarysearch(ArrayList<Integer> obj,int ele){
        int index=-1;
        int low=0;
        int high=obj.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(obj.get(mid)==ele){
                index=mid;
                high=mid-1;
            }
            else if(obj.get(mid)>ele){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return index;
        
    }
    int[] constructLowerArray(int[] arr) {
        // code here
        int ans[]=new int[arr.length];
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            temp.add(arr[i]);
        }
        Collections.sort(temp);
        for(int i=0;i<arr.length;i++){
            int ind=binarysearch(temp,arr[i]);
            ans[i]=ind;
            temp.remove(ind);
        }
        return ans;
    }
}
