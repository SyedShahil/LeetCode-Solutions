class Find_the_Winning_Player_in_Coin_Game{
    public String losingPlayer(int x, int y) {
       if(x<1 || y<4){
           return "Bob";
       }
        int i=0;
        while(x>=1 && y>=4){
            i++;
            x--;
            y=y-4;
        }
        if(i%2!=0)return "Alice";
        return "Bob";
    }
}
