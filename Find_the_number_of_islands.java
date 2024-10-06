class Find_the_number_of_islands{
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int temp[][]=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && temp[i][j]==0){
                    dfs(grid,temp,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(char grid[][],int temp[][],int i,int j){
        if(i<0 || j<0 || i>=temp.length || j>=temp[0].length || temp[i][j]==1 || grid[i][j]=='0'){
            return ;
        }
        temp[i][j]=1;
        int row[]={-1,1,0,0,-1,-1,1,1};
        int col[]={0,0,-1,1,-1,1,-1,1};
        for(int k=0;k<8;k++){
            int r=i+row[k];
            int c=j+col[k];
           dfs(grid,temp,r,c);
        }
    }
}
