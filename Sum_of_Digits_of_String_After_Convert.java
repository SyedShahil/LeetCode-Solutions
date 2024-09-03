class  Sum_of_Digits_of_String_After_Convert{
    public int getLucky(String s, int k) {
        StringBuilder obj=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int temp=ch-'a'+1;
            obj.append(temp);
        }
 
        while (k>0){
          int sum=0;
            for(int i=0;i<obj.length();i++){
                sum+=obj.charAt(i)-'0';
            }
            k--;
            obj=new StringBuilder(String.valueOf(sum));
        }
        return Integer.parseInt(obj.toString());
    }
}
