class Remove_K_Digits{
    public String removeKdigits(String num, int k) {
        if(k==num.length()){
            return "0";
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
             k--;
        }
        StringBuilder res=new StringBuilder();
      while(!st.isEmpty()){
           res.append(st.pop());
      }
        res.reverse();
      
        while(res.charAt(0)=='0' && res.length()>1){
            res.deleteCharAt(0);
        }
        return res.toString();
    }
}
