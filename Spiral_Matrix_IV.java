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
class  Spiral_Matrix_IV{
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int left=0;
        int top=0;
        int right=n-1;
        int bottom=m-1;
        int ans[][]=new int[m][n];
             for (int[] row : ans) {
            Arrays.fill(row, -1);
        }
        while(left<=right && top<=bottom ){
            for(int i=left;i<=right;i++){
                ans[top][i]=head==null?-1:head.val;
                head=head!=null?head.next:null;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                ans[j][right]=head==null?-1:head.val;
               head=head!=null?head.next:null;
            }
            right--;
            if(top<=bottom){
            for(int k=right;k>=left;k--){
                ans[bottom][k]=head==null?-1:head.val;
              head=head!=null?head.next:null;
            }
            
            bottom--;
            }
            if(left<=right){
            for(int l=bottom;l>=top;l--){
                ans[l][left]=head==null?-1:head.val;
                head=head!=null?head.next:null;
            }
            left++;
            }
        }
        return ans;
    }
}
