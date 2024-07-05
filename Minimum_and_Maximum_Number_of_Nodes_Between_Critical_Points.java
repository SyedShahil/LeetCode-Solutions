class Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points{
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       int ans[]=new int[2];
          if(head.next.next==null || head==null ||head.next==null){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        ListNode temp=head.next;
        ListNode prev=head;
      
        ArrayList<Integer> list=new ArrayList<>();
            int cnt=1;
        while(temp.next!=null){
            if((temp.val>prev.val && temp.val>temp.next.val) || (temp.val<prev.val && temp.val<temp.next.val)){
                list.add(cnt);
            }
            prev=temp;
            temp=temp.next;
            cnt++;
        }
        if(list.size()<2){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            mini=Math.min(mini,list.get(i+1)-list.get(i));
        }
        int maxi=list.get(list.size()-1)-list.get(0);
        ans[0]=mini;
        ans[1]=maxi;
        return ans;
        
        
        
    }
}
