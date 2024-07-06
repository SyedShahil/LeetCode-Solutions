class Pass_the_Pillow{
    public int passThePillow(int n, int time) {
        int i=1;
        while(time>0)
        {
            while(time>0 && i<n)
            {
                i++;
                time--;
            }
            if(time==0) return i;
            while(time>0 && i>1)
            {
                i--;
                time--;
            }
            if(time==0)
            {
                return i;
            }
        }
        return -1;
    }
 }
