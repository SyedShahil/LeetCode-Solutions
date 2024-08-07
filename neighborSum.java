class neighborSum{
    private int n;
    private int grid[][];
    private int position[][];
    public neighborSum(int[][] grid) {
        this.n=grid.length;
        this.grid=grid;
        this.position=new int[n*n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int value=grid[i][j];
                position[value][0]=i;
                position[value][1]=j;
            }
        }
    }
    
    public int adjacentSum(int value) {
        if(value<0 || value>=n*n){
            return 0;
        }
        int i=position[value][0];
        int j=position[value][1];
        int sum=0;
        int direction[][]={{-1,0},{0,1},{1,0},{0,-1}};
        for(int direct[]:direction){
            int ni=direct[0]+i;
            int nj=direct[1]+j;
            if(ni>=0 && ni<n && nj>=0 && nj<n){
                sum+=grid[ni][nj];
            }
        }
    return sum;
    }
    
    public int diagonalSum(int value) {
        if(value <0 || value>=n*n){
            return 0;
        }
        int i=position[value][0];
        int j=position[value][1];
        int sum=0;
        int direction[][]={{-1,-1},{-1,1},{1,1},{1,-1}};
        for(int direct[]:direction){
            int ni=i+direct[0];
            int nj=j+direct[1];
            if(ni>=0 && ni<n && nj>=0 && nj<n){
                sum+=grid[ni][nj];
            }
        }
        return sum;
    }
}

