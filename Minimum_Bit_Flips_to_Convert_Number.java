class  Minimum_Bit_Flips_to_Convert_Number{
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int cnt=0;
        while(ans>1){
            if(ans%2!=0){
                cnt++;
            }
            ans=ans/2;
        }
        if(ans==1){
            cnt++;
        }
        return cnt;
    }
}
