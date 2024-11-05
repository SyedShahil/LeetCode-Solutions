class  Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful{
    public int minChanges(String s) {
     int cnt=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
}
