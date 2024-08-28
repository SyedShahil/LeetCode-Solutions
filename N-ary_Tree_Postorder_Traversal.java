/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class N-ary_Tree_Postorder_Traversal{
    public List<Integer> postorder(Node root) {
     List<Integer> ans=new ArrayList<>();
        post(root,ans);
        return ans;
    }
    public void post(Node root,List<Integer> ans){
        if(root==null){
            return;
        }
        for(int i=0;i<root.children.size();i++){
            post(root.children.get(i),ans);
        }
        ans.add(root.val);
    }
}