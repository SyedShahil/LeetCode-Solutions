class Minimum_Number_of_Swaps_to_Make_the_String_Balanced
{
    public int minSwaps(String s) {
        int close=0;
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                open++;
            }
            else if(open>=1)open--;
            else{
                close++;
            }
        }
        return (open+1)/2;
    }
}
