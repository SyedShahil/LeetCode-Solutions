class  String_Compression_III{
    public String compressedString(String word) {
        StringBuilder ans=new StringBuilder();
        char ele=word.charAt(0);
        int cnt=0;
        for(int i=0;i<word.length();i++){
            if(cnt>=9){
                ans.append(cnt);
                ans.append(ele);
                ele=word.charAt(i);
                cnt=0
                    ;
            }
            if(ele==word.charAt(i)){
                cnt++;
            }
            
            else{
                ans.append(cnt);
                ans.append(ele);
                ele=word.charAt(i);
                cnt=1;
            }
        }
        ans.append(cnt);
        ans.append(ele);
        return ans.toString();
    }
}
