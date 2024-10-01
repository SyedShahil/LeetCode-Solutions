class Find_the_K-th_Character_in_String_Game_I{
    public char kthCharacter(int k) {
        StringBuilder obj=new StringBuilder("a");
        while(obj.length()<k){
            StringBuilder temp=new StringBuilder();
            for(int i=0;i<obj.length();i++){
                char ch=obj.charAt(i);
                if(ch=='z'){
                    temp.append('a');
                }
                else{
                temp.append((char)(ch+1));
                }
            }
            obj.append(temp);
        }
        return obj.charAt(k-1);
    }
}
