class Insert_Interval{
    public int[][] insert(int[][] intervals, int[] newInterval) {
     List<int[]> obj=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n && newInterval[0]>intervals[i][1] ){
            obj.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        obj.add(newInterval);
        while(i<n){
            obj.add(intervals[i]);
            i++;
        }
        return obj.toArray(new int[obj.size()][]);
    }
}
