class Alternating_Groups{
    public int numberOfAlternatingGroups(int[] colors) {
        if(colors.length<3){
            return 0;
        }
        int ans=0;
        if(colors[0]!=colors[colors.length-1] && colors[0]!=colors[1]){
            ans++;
        }
        int i=1;
        for( i=1;i<colors.length-1;i++){
            if(colors[i]!=colors[i-1] && colors[i]!=colors[i+1]){
                ans++;
            }
        }
        if(colors[i]!=colors[i-1] && colors[i]!=colors[0]){
            ans++;
        }
        return ans;
    }
}
