class  Sort_the_People{
    public String[] sortPeople(String[] names, int[] heights) {
     for(int i=0;i<names.length;i++){
         for(int j=0;j<names.length-i-1;j++){
             if(heights[j]<heights[j+1]){
                 int tm=heights[j];
                 heights[j]=heights[j+1];
                 heights[j+1]=tm;
                String temp=names[j];
                 names[j]=names[j+1];
                 names[j+1]=temp;
             }
         }
     }   
        return names;
    }
}
