class Facing_the_sun{
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int cnt=1;
        int temp=height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>temp){
                cnt++;
                temp=height[i];
            }
        }
        return cnt;
    }
}
