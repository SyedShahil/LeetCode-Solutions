class  XOR_Queries_of_a_Subarray{
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            int temp=0;
            for(int j=s;j<=e;j++){
                temp^=arr[j];
            }
            ans[i]=temp;
        }
        return ans;
    }
}
