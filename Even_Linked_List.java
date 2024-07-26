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
class 
Odd Even_Linked_List{
    public ListNode oddEvenList(ListNode head) {
    ListNode odd=new ListNode(-1);
    ListNode even=new ListNode(-1);
    ListNode cur1=odd;
    ListNode cur2=even;
    int i=1;
    while(head!=null){
        if(i%2!=0){
            cur1.next=head;
            cur1=cur1.next;
        }
        else{
            cur2.next=head;
            cur2=cur2.next;
        }
        head=head.next;
        i++;
    }
    cur2.next=null;
    cur1.next=even.next;
    return odd.next;
        
    }
}
