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
class Delete_Nodes_From_Linked_List_Present_in_Array{
    public ListNode modifiedList(int[] nums, ListNode head) {
      
        HashSet<Integer> obj=new HashSet<>();
        for(int num: nums){
            obj.add(num);
        }
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(head!=null){
            if(!obj.contains(head.val)){
                cur.next=head;
                cur=cur.next;
            }
            head=head.next;
        }
        cur.next=null;
        return dummy.next;
    }
}
