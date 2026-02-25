// Recursive approach TC: O(n) SC: O(n) (Stack Space)
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ans;
    }
    List<Integer> ans=new ArrayList<>();
    public void preorder(TreeNode root){
        if(root==null)
        return;
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
// Iterative approach TC: O(n) SC: O(n)
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
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Stack<TreeNode> curr=new Stack<>();
        curr.add(root);
        while(!curr.isEmpty()){
            TreeNode cur=curr.pop();
            ans.add(cur.val);
            if(cur.right!=null){
                curr.push(cur.right);
            }
            if(cur.left!=null){
                curr.push(cur.left);
            }
        }
        return ans;
    }
}
