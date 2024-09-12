class Count_the_Number_of_Consistent_Strings{
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> obj=new HashSet<>();
        for(char c:allowed.toCharArray()){
            obj.add(c);
        }
        int cnt=0;
        for(String word:words){
            boolean con=true;
            for(char ch:word.toCharArray()){
                if(!obj.contains(ch)){
                    con=false;
                    break;
                }
            }
            if(con){
                cnt++;
            }
        }
        return cnt;
    }
}
