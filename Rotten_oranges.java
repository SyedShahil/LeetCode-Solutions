class Pair{
    int row;
    int col;
    int tm;
    Pair(int row,int col,int tm){
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}
class Rotten_oranges{
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt_fresh=0;
        Queue<Pair> q=new LinkedList<>();
        int visited[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1){
                    cnt_fresh++;
                }
            }
        }
        int tm=0;
        int cnt=0;
        int []drow={-1,0,1,0};
        int []dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
             tm=Math.max(t,tm);
            q.poll();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 &&  ncol<m && nrow<n && ncol>=0 && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    visited[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        if(cnt==cnt_fresh){
            return tm;
        }
        return -1;
        
        
    }
}
