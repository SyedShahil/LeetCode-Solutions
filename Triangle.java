class Triangle{
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int [n][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return find(triangle,dp,0,0);
    }
    public int find(List<List<Integer>> triangle,int dp[][],int i,int j){
        if(i==triangle.size())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int down=triangle.get(i).get(j)+find(triangle,dp,i+1,j);
        int dia=triangle.get(i).get(j)+find(triangle,dp,i+1,j+1);
        return dp[i][j]=Math.min(down,dia);
    }
}
