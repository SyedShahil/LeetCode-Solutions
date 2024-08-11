class Snake_in_Matrix{
    public int finalPositionOfSnake(int n, List<String> commands) {
       int grid[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=(i*n)+j;
            }
        }
        int i=0;
        int j=0;
        for(int k=0;k<commands.size();k++){
            String command=commands.get(k);
            if(command.equals("RIGHT") && j<n-1){
                j++;
            }
            else if(command.equals("DOWN") && i<n-1){
                i++;
            }
            else if(command.equals("UP") && i>=0){
                i--;
            }
            else if(command.equals("LEFT") && j>=0){
                j--;
            }
        }
        return grid[i][j];
    }
}
