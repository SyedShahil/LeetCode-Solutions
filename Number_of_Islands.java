class Number_of_Islands{
    int rows;
    int cols;
    public int numIslands(char[][] grid) {
        rows=grid.length;
        int island=0;
        cols=grid[0].length;
        boolean visit[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(visit[i][j]==false && grid[i][j]=='1'){
                    dfs(grid,visit,i,j);
                    island++;
                }
            }
        }
        return island;
    }
    public void dfs(char [][]grid,boolean [][]visit,int row,int col){
        if(row<0 || row>=rows || col<0 || col>=cols || visit[row][col]==true ||grid[row][col]!='1'){
            return;
        }
        visit[row][col]=true;
        int dir[][]={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int a[]:dir){
            int r=a[0];
            int c=a[1];
                dfs(grid,visit,r,c);
        }
    }
}
