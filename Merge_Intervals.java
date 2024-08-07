class Merge_Intervals{
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));
        List<int[]> ans=new ArrayList<>();
        int[] newInterval=intervals[0];    
        ans.add(newInterval);
        for(int[] interval:intervals){
            if(interval[0]<=newInterval[1]){
                newInterval[1]=Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval=interval;
                ans.add(newInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
