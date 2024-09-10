/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Insert_Greatest_Common_Divisors_in_Linked_List{
    public int gcd(int a,int b){
        if(b==0){return a;}
        return gcd(b,a%b);
        
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            int a =temp.val;
            int b=temp.next.val;
            int c=gcd(a,b);
            ListNode newnode=new ListNode(c);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
        }
        return head;
    }
}
