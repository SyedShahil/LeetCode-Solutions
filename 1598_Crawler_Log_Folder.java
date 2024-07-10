class 1598_Crawler_Log_Folder{
    public int minOperations(String[] logs) {
        int files=0;
        String two="../";
        String one="./";
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals(two)){
                if(files>0){
                    files--;
                }
            }
            else if(logs[i].equals(one)){
                continue;
            }
            else{
                files++;
            }
        }
     return files;   
    }
}
