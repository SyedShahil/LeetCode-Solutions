class Excel_Sheet_Column_Title{
    public String convertToTitle(int columnNumber) {
        StringBuilder ans=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char letter=(char)(columnNumber%26+'A');
            ans.insert(0,letter);
            columnNumber=columnNumber/26;
        }
        return ans.toString();
    }
}
