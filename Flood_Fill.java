class Flood_Fill{
   private int rows;
    private int cols;
    public  void dfs(int[][] img,int sr,int sc,int color,int curcolor ){
        int row=sr;
        int col=sc;
        if(row<0 || row>=rows || col<0 || col>=cols || img[row][col]!=curcolor || img[row][col]==color ){
            return;
        }
        img[row][col]=color;
        int adj[][]={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int a[]:adj){
            dfs(img,a[0],a[1],color,curcolor);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows=image.length;
        cols=image[0].length;
    dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}
