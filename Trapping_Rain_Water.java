class Trapping_Rain_Water{
    public int trap(int[] height) {
        int prefix[]=new int[height.length];
        prefix[0]=height[0];
        for(int i=1;i<height.length;i++){
            prefix[i]=Math.max(height[i],prefix[i-1]);
        }
        int suffix[]=new int[height.length];
        suffix[height.length-1]=height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            suffix[j]=Math.max(height[j],suffix[j+1]);
        }
        int total=0;
        for(int i=0;i<height.length;i++){
            int leftmax=prefix[i];
            int rightmax=suffix[i];
            total=total+Math.min(leftmax,rightmax)-height[i];
        }
        return total;
    }
}
