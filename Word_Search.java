class Word_Search{
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if( find(board,word,i,j,0)){
                    return true;
                }   
            }
        }
       
        return false;
    }
    public boolean find(char[][] mat,String word,int i,int j,int ptr){
        if(ptr==word.length()){
           return true;
        }
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j]!=word.charAt(ptr)){
            return false;
        }
        char temp=mat[i][j];
        mat[i][j]='#';
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        boolean found=false;
        for(int k=0;k<4;k++){
            int r=row[k]+i;
            int c=col[k]+j;
            if(find(mat,word,r,c,ptr+1)){
                found=true;
                break;
            }
        }
        mat[i][j]=temp;
        return found;
    }
}
