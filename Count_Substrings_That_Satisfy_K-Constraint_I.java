class Count_Substrings_That_Satisfy_K-Constraint_I{
    public int countKConstraintSubstrings(String s, int k) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            int zero=0;
            int one=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch=='0'){
                    zero++;
                }
                else if(ch=='1'){
                    one++;
                }
                if(zero<=k || one<=k){
                    cnt++;
                }
              
            }
        }
        return cnt;
    }
}
