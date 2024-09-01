class Convert_1D_Array_Into_2D_Array{
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length!=m*n){
            return new int[0][0];
        }
        int ans[][]=new int[m][n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=original[k];
                k++;
            }
        }
        return ans;
    }
}
