// Recursive Solution TC: O(n) SC: O(n)
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }
    List<Integer> ans=new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
}
// Iterative Solution TC: O(n) SC: O(n)
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();   
            ans.add(current.val);    

            current = current.right; 
        }

        return ans;
    }
}
