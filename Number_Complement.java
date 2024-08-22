class Number_Complement{
    public int findComplement(int num) {
        if(num==1)return 0;
         String binarystring = Integer.toBinaryString(num);
        StringBuilder obj=new StringBuilder();
     for(char bit:binarystring.toCharArray() ){
         if(bit=='0'){
             obj.append('1');
         }
         else{
             obj.append('0');
         }
     }
    int decimal = Integer.parseInt(obj.toString(), 2);
    return decimal;
    }
}
