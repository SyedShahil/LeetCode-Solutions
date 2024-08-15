
class Add_1_to_a_Linked_List_Number{
    public Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node nextnode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnode;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        Node temp1=reverse(head);
        Node temp=temp1;
        int c=1;
        while(temp.next!=null){
         if(temp.data+c>9){
             temp.data=0;
             c=1;
         }
         else{
             temp.data+=1;
             c=0;
             break;
         }
         temp=temp.next;
        }
        if(c==1){
            if(temp.data+c>10){
            temp.data=0;
            Node ad=new Node(1);
            ad.next=null;
            temp.next=ad;
            }
           else{
               temp.data+=1;
           }
        }
        Node ans=reverse(temp1);
        return ans;
    }
}

