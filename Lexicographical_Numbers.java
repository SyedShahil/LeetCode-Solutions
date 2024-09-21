class Lexicographical_Numbers{
    public List<Integer> lexicalOrder(int n) {
        List<Integer> obj=new ArrayList<>();
        for(int i=1;i<10;i++){
            dfs(i,obj,n);
        }
        return obj;
    }
    public void dfs(int j,List<Integer> obj,int n){
        if(j>n){
            return;
        }
        obj.add(j);
        for(int i=0;i<10;i++){
            if(j*10+i>n)break;
            dfs(j*10+i,obj,n);
        }
    }
}
