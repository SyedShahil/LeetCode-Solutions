class  The_Number_of_the_Smallest_Unoccupied_Chair{
    public int smallestChair(int[][] times, int targetFriend) {
        int ans=times[targetFriend][0];
        Arrays.sort(times,(a,b)->Integer.compare(a[0],b[0]));
        int n=times.length;
        PriorityQueue<int[]> obj1=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int chair=0;
        PriorityQueue<Integer> obj2=new PriorityQueue<>();
        for(int time[]:times){
            int a1=time[0];
            int a2=time[1];
            while(!obj1.isEmpty() && obj1.peek()[0]<=a1){
                obj2.offer(obj1.poll()[1]);
            }
            int chairno;
            if(obj2.isEmpty()){
                chairno=chair;
                chair++;
            }
            else{
                chairno=obj2.poll();
            }
            if(a1==ans){
                return chairno;
            }
            obj1.add(a2,chairno);
        }
        return -1;
    }
}
