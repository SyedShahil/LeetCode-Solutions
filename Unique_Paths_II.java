class Unique_Paths_II{
    public int find(int dp[][],int grid[][],int i,int j){
        if(i<0 || j<0)return 0;
        if(grid[i][j]==1)return 0;
        if(i==0 && j==0)return 1;
        
        if(dp[i][j]!=-1)return dp[i][j];
        int up=find(dp,grid,i-1,j);
        int left=find(dp,grid,i,j-1);
        return dp[i][j]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid[0].length;
        int m=obstacleGrid.length;
        int dp[][]=new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return find(dp,obstacleGrid,m-1,n-1);
    }
}
