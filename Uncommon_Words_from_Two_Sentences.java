class Uncommon_Words_from_Two_Sentences{
    public String[] uncommonFromSentences(String s1, String s2) {
       Map<String,Integer> obj=new HashMap();
        for(String word:s1.split(" ")){
            obj.put(word,obj.getOrDefault(word,0)+1);
        }
        for(String word:s2.split(" ")){
            obj.put(word,obj.getOrDefault(word,0)+1);
        }
        ArrayList<String> ans=new ArrayList<>();
        for(String word:obj.keySet()){
            if(obj.get(word)==1){
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }
}
