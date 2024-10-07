class  Minimum_String_Length_After_Removing_Substrings{
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curchar=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(curchar);
                continue;
            }
            if(curchar == 'B' && stack.peek()=='A' ){
                stack.pop();
            }
            else if(curchar =='D' && stack.peek()=='C'){
                stack.pop();
            }
            else{
                stack.push(curchar);
            }
        }
        return stack.size();
    }
}
