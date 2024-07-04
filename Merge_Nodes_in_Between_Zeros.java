class Merge_Nodes_in_Between_Zeros{
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode ans=new ListNode(0);
        ListNode cur=ans;
        int sum=0;
        while(temp!=null){
            sum=sum+temp.val;
            if(temp.val==0){
                ListNode newnode=new ListNode(sum);
               sum=0;
                cur.next=newnode;
                cur=cur.next;
            }
            temp=temp.next;
        }
        return ans.next;
    }
}
