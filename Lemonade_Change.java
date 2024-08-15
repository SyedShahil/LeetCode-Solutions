class Lemonade_Change{
    public boolean lemonadeChange(int[] bills) {
     int five=0;
    int ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
            five+=5;
            }
            else if(bills[i]==10){
                if(five>=5){
                five-=5;
                }
                else{
                    return false;
                }
                ten+=10;
            }
            else{
                if(ten>=10 && five>=5){
                ten-=10;
                five-=5;
                }
                else if(five>=15){
                    five-=15;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
