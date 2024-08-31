class Hash_Divided_String{
    public String stringHash(String s, int k) {
        StringBuilder obj=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            int sum=0;
            String temp=s.substring(i,i+k);
            for(char ch:temp.toCharArray()){
                sum+=ch-'a';
            }
            int o=sum%26;
            obj.append((char)(o+'a'));
        }
        return obj.toString();
    }
}
