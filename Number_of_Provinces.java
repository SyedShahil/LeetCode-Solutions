class Number_of_Provinces{
    public void dfs(boolean arr[],int i,int adj[][]){
        arr[i]=true;
        for(int j=0;j<adj.length;j++){
            if(adj[i][j]==1 && arr[j]==false){
                dfs(arr,j,adj);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int cnt=0;
        int n=isConnected.length;
        boolean arr[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(arr[i]==false){
                cnt++;
                dfs(arr,i,isConnected);
            }
        }
            return cnt;

    }
}
