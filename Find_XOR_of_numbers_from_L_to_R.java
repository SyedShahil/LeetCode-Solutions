class Find_XOR_of_numbers_from_L_to_R{
    public static int findXOR(int l, int r) {
        if(r==0){
            return 0;
        }
      int xor1=find(l-1);
      int xor2=find(r);
        return xor1^xor2;
    }
   public static  int find(int n){
          if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else if(n%4==3){
            return 0;
        }
        else if(n%4==0){
            return n;
        }
        return 0;
    }
}
