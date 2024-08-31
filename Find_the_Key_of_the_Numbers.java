class Find_the_Key_of_the_Numbers{
    public int generateKey(int num1, int num2, int num3) {
       String s1=String.format("%04d",num1);
       String s2=String.format("%04d",num2);
       String s3=String.format("%04d",num3);
       StringBuilder obj=new StringBuilder();
       for(int i=0;i<4;i++){
        char d1=s1.charAt(i);
        char d2=s2.charAt(i);
        char d3=s3.charAt(i);
        char mini=(char)(Math.min(d1,Math.min(d2,d3)));
        obj.append(mini);
        }
        return Integer.parseInt(obj.toString());
    }
}
