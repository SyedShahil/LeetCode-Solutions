class Divide_Intervals_Into_Minimum_Number_of_Groups{
    public int minGroups(int[][] intervals) {
     int n=intervals.length;
     int mini=Integer.MAX_VALUE;
    int maxi=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        mini=Math.min(mini,intervals[i][0]);
        maxi=Math.max(maxi,intervals[i][1]);
    }
    int arr[]=new int[maxi+2];
    for(int[] interval:intervals){
        arr[interval[0]]++;
        arr[interval[1]+1]--;
    }
    int ans=0;
    int ci=0;
    for(int i=mini;i<=maxi;i++){
        ci+=arr[i];
        ans=Math.max(ans,ci);
    }
        return ans;
    }
}
