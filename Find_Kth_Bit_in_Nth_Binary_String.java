class Find_Kth_Bit_in_Nth_Binary_String{
    public char findKthBit(int n, int k) {
        StringBuilder obj=new StringBuilder("0");
        while(obj.length()<k){
                StringBuilder temp=new StringBuilder(obj);
            obj.append("1");
            for(int i=0;i<temp.length();i++){
              temp.setCharAt(i,temp.charAt(i)=='0'?'1':'0');
            }
            obj.append(temp.reverse());
        }
        return obj.charAt(k-1);
    }
}
