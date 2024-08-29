class Most_Stones_Removed_with_Same_Row_or_Column{
    public void dfs(int src,List<List<Integer>> adj,boolean visited[]){
        visited[src]=true;
        for(int neigh:adj.get(src)){
            if(!visited[neigh]){
                dfs(neigh,adj,visited);
            }
        }
    }
    public int removeStones(int[][] stones) {
        int n=stones.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int cnt=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                cnt++;
            }
        }
        return n-cnt;
    }
}
