/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MaximumPathSum{
    public int maxPathSum(TreeNode root) {
        int []max_value=new int[1];
        max_value[0]=Integer.MIN_VALUE;
        maxpath(root,max_value);
        return max_value[0];
    }
    public int maxpath(TreeNode root,int []max_value){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,maxpath(root.left,max_value));
        int r=Math.max(0,maxpath(root.right,max_value));
        max_value[0]=Math.max(max_value[0],l+r+root.val);
        return root.val+Math.max(l,r);
    }
}
