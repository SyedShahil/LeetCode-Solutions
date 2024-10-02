class Rank_Transform_of_an_Array{
    public int[] arrayRankTransform(int[] arr) {
        int tem[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            tem[i]=arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> obj=new HashMap<>();
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if(obj.containsKey(arr[i])){
                continue;
            }
            else{
                obj.put(arr[i],rank++);
            }
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=obj.get(tem[i]);
        }
        return ans;
    }
}
