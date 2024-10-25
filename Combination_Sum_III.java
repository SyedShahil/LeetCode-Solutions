class Combination_Sum_III{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int nums[]=new int[9];
        for(int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }
        ArrayList<Integer> sublist=new ArrayList<>();
        find(nums,n,k,sublist,0);
        return ans;
    }
    public void find(int arr[],int tar,int k,ArrayList<Integer> sub,int ind){
        if(tar==0 && sub.size()==k){
            ans.add(new ArrayList<>(sub));
            return ;
        }
        if(ind==arr.length){
            return ;
        }
        sub.add(arr[ind]);
        find(arr,tar-arr[ind],k,sub,ind+1);
        sub.remove(sub.size()-1);
        find(arr,tar,k,sub,ind+1);
    }
}
