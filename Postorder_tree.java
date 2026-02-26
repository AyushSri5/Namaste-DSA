// Recursive Solution TC: O(n) SC: O(n) Stack Space
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         preorder(root);
        return ans;
    }
    List<Integer> ans=new ArrayList<>();
    public void preorder(TreeNode root){
        if(root==null)
        return;
        
        preorder(root.left);
        preorder(root.right);
        ans.add(root.val);
    }
}
// Iterative Solution TC: O(n) SC: O(n)
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
        return ans;
        Stack<TreeNode> curr=new Stack<>();
        Stack<TreeNode> temp=new Stack<>();
        curr.push(root);
        while(!curr.isEmpty()){
            TreeNode c=curr.pop();
            temp.push(c);

            if(c.left!=null){
                curr.push(c.left);
            }
            if(c.right!=null){
                curr.push(c.right);
            }
        }
        while(!temp.isEmpty()){
            ans.add(temp.pop().val);
        }
        return ans;
    }
}
