class Non_overlapping_Intervals{
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0 || intervals.length==1){
            return 0;
        }
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int cnt=0;
        int ref=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<ref){
                cnt++;
            }
            else{
                    ref=intervals[i][1];
            }
        }
        return cnt;
    }
}
