class Report_Spam_Message{
    public boolean reportSpam(String[] message, String[] bannedWords) {
       HashMap<String,Integer> obj=new HashMap<>();
        for(int i=0;i<message.length;i++){
            obj.put(message[i],obj.getOrDefault(message[i],0)+1);
        }
        int cnt=0;
        for(int j=0;j<bannedWords.length;j++){
            if(obj.containsKey(bannedWords[j])){
                cnt+=obj.get(bannedWords[j]);
                obj.put(bannedWords[j], 0);
            }
        }
        if(cnt>=2)return true;
        return false;
    }
}
