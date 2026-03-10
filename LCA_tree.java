// Optimised approach TC: O(N) SC: O(1)
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowest(root,p,q);
    }
    public TreeNode lowest(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)
        return null;
        if(root==p || root==q){
            return root;
        }
        TreeNode left=lowest(root.left,p,q);
        TreeNode right=lowest(root.right,p,q);
        if(left==null)
        return right;
        else if(right==null)
        return left;
        else{
            return root;
        }
    }
}
