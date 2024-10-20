class  Parsing_A_Boolean_Expression{
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch==')'){
                ArrayList<Character> ans=new ArrayList<>();
                while(st.peek()!='('){
                    ans.add(st.pop());
                }
                st.pop();
                char op=st.pop();
                char res=find(op,ans);
                st.push(res);
            }
            else{
                if(ch!=','){
                    st.push(ch);
                }
            }
        }
        if(st.peek()=='t'){
            return true;
        }
        return false;
    }
    public char find(char op,ArrayList<Character> obj){
        if(op=='|'){
            for(char val:obj){
                if(val=='t')return 't';
            }
            return 'f';
        }
        else if(op=='&'){
            for(char val:obj){
                if(val=='f')return 'f';
            }
            return 't';
        }
        else{
            return obj.get(0)=='t'?'f':'t';
        }
    }
}
